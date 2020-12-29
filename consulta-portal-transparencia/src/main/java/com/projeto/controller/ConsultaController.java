package com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.model.User;

@Controller
public class ConsultaController {

	@GetMapping({ "/", "/home" })
	public String helloWorld(Model model) {
		List<User> lista = new ArrayList<User>();

		lista.add(new User(1L, "Felipe", "felipe.bilhares@hotmail.com"));
		lista.add(new User(2L, "Rodrigo", "rsantos.teste@gmail.com"));
		lista.add(new User(3L, "Flavio", "flv@yahoo.com"));
		model.addAttribute("users", lista);

		return "home";
	}

	@PostMapping("/consultar")
	public String addUser(Model model) {
		System.out.println("postzin");
		return "home";
	}

}
