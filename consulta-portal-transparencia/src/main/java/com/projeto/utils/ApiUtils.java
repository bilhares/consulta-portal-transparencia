package com.projeto.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.projeto.model.Parametros;

@Service
public class ApiUtils {

	@Value("${chave_api}")
	private String chaveApi;

	@Value("${url_api}")
	private String urlApi;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String buscarDadosApi(Parametros parametros) {
		String retorno = "";		

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("chave-api-dados", chaveApi);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlApi)
				.queryParam("mesExtratoInicio", parametros.getMesExtratoInicio())
		        .queryParam("mesExtratoFim", parametros.getMesExtratoFim())
		        .queryParam("pagina", 1);
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> response = restTemplate.exchange( builder.toUriString(), HttpMethod.GET, entity, String.class);
		
		System.out.println(response.getBody());
		return retorno;
	}
}
