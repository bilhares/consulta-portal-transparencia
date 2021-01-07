package com.projeto.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.projeto.model.ConsultaDto;
import com.projeto.model.Parametros;

@Service
public class ApiUtils {

	@Value("${chave_api}")
	private String chaveApi;

	@Value("${url_api}")
	private String urlApi;

	@Autowired
	RestTemplate restTemplate;

	public List<ConsultaDto> buscarDadosApi(Parametros parametros) {

		HttpHeaders headers = new HttpHeaders();
		configurarHeaders(headers);

		UriComponentsBuilder builder = configurarParametros(parametros);

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<List<ConsultaDto>> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,
				entity, new ParameterizedTypeReference<List<ConsultaDto>>() {
				});

		if (response.getStatusCodeValue() != 200)
			return new ArrayList<ConsultaDto>();

		return response.getBody();
	}

	private UriComponentsBuilder configurarParametros(Parametros parametros) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlApi)
				.queryParam("mesExtratoInicio", parametros.getMesExtratoInicio())
				.queryParam("mesExtratoFim", parametros.getMesExtratoFim()).queryParam("pagina", 1);
		return builder;
	}

	private void configurarHeaders(HttpHeaders headers) {
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("chave-api-dados", chaveApi);
	}

}
