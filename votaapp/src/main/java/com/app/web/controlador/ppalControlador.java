package com.app.web.controlador;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ppalControlador {

	@GetMapping("/votapp")
	public String login() {
		return "/login";
	}



}
