package com.projeto.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.projeto.model.Cnae;
import com.projeto.model.Cartoes;
import com.projeto.model.CsvDto;
import com.projeto.model.OrgaoMaximo;
import com.projeto.model.Parametros;
import com.projeto.utils.ApiUtils;

@Service
public class ConsultaPortalTransparenciaService {

	@Autowired
	ApiUtils apiUtils;

	public void consultarPortal(Parametros parametros, HttpServletResponse response) {
		List<Cartoes> dadosDaConsulta = apiUtils.buscarDadosApi(parametros);
		List<CsvDto> listaCsvDto = obterCsvDto(dadosDaConsulta);
		gerarArquivoCSV(listaCsvDto, response);
	}

	private List<CsvDto> obterCsvDto(List<Cartoes> dadosDaConsulta) {
		List<CsvDto> listaRetorno = new ArrayList<CsvDto>();

		dadosDaConsulta.forEach(consultaDto -> {

			Cnae cnae = consultaDto.getEstabelecimento().getCnae();
			OrgaoMaximo orgaoMaximo = consultaDto.getUnidadeGestora().getOrgaoVinculado().getOrgaoMaximo();

			listaRetorno.add(new CsvDto(consultaDto.getDataTransacao(), consultaDto.getValorTransacao(),
					consultaDto.getEstabelecimento().getRazaoSocialReceita(),
					consultaDto.getEstabelecimento().getNumeroInscricaoSocial(), cnae.getClasse(), cnae.getDivisao(),
					cnae.getGrupo(), cnae.getGrupo(), orgaoMaximo.getCodigo(), orgaoMaximo.getNome(),
					orgaoMaximo.getSigla()));
		});

		return listaRetorno;
	}

	private void gerarArquivoCSV(List<CsvDto> listaCsvDto, HttpServletResponse response) {
		try {
			ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

			String[] csvHeader = informacoesCsv();
			String[] nameMapping = informacoesCsv();

			csvWriter.writeHeader(csvHeader);

			for (CsvDto dto : listaCsvDto) {
				csvWriter.write(dto, nameMapping);
			}
			csvWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String[] informacoesCsv() {
		return new String[] { "dataTransacao", "valorTransacao", "razaoSocialReceitaEstabelecimento",
				"numeroInscricaoSocialEstabelecimento", "cnaeClasse", "cnaeDivisao", "cnaeGrupo", "cnaeSubclasse",
				"orgaoMaximoCodigo", "orgaoMaximoNome", "orgaoMaximoSigla" };
	}
}
