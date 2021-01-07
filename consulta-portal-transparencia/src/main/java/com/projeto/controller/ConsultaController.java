package com.projeto.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

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
	public String home(Model model) {
		model.addAttribute("parametros", new Parametros());
		return "home";
	}

	@PostMapping("/consultar")
	public String consultar(Parametros parametros, BindingResult result, Model model, HttpServletResponse response) {

		response.setContentType("text/csv");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=" + currentDateTime + ".csv";
		response.setHeader(headerKey, headerValue);

		consultaService.consultarPortal(parametros, response);
		return "home";
	}

}
