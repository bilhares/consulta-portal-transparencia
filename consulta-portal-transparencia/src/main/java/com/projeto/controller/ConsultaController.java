package com.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.model.Parametros;
import com.projeto.service.ConsultaPortalTransparenciaService;

@Controller
public class ConsultaController {
	
	@Autowired
	ConsultaPortalTransparenciaService consultaService;

	@GetMapping({ "/", "/home" })
	public String helloWorld() {
		return "home";
	}

	@PostMapping("/consultar")
	public String addUser(Parametros parametros, BindingResult result, Model model) {
		consultaService.consultarPortal(parametros);
		return "home";
	}

}
