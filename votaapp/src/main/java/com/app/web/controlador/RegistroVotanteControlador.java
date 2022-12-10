package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.web.servicio.VotanteServicio;
import com.app.web.votante.dto.VotanteRegistroDTO;

@Controller
@RequestMapping("/registro")
public class RegistroVotanteControlador {

	@Autowired
	private VotanteServicio votanteServicio;
	
	@ModelAttribute("votante")
	public VotanteRegistroDTO retornarNueVotanteRegistroDTO() {
		return new VotanteRegistroDTO();
	}
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeVotante(@ModelAttribute("votante") VotanteRegistroDTO registroDTO) {
		votanteServicio.guardar(registroDTO);
		return "redirect:/registro?exito";
	}
}
