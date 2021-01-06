package com.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.model.Parametros;
import com.projeto.utils.ApiUtils;

@Service
public class ConsultaPortalTransparenciaService {

	@Autowired
	ApiUtils apiUtils;
	
		
	public void consultarPortal(Parametros parametros) {
		apiUtils.buscarDadosApi(parametros);
	}
}
