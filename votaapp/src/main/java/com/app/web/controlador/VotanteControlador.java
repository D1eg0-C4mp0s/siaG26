package com.app.web.controlador;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Votante;
import com.app.web.repositorios.VotanteRepositorio;

@Controller
public class VotanteControlador {
	@Autowired
	private VotanteRepositorio votanteRepositorio;
	Votante objVot = new Votante();
	
	@PostMapping("/validar")
	public String valida(@Validated Votante votante, Model model) {
		try {
			Optional<Votante> objVotante = votanteRepositorio.findById(votante.getIdentificacion());
			
			if (objVotante.isPresent()) {
				
				objVot = objVotante.get();
				if(objVot.getIdentificacion() == votante.getIdentificacion() && objVot.getClave().equals(votante.getClave())){
				model.addAttribute("voto", objVotante.get());
				return "/index";
				
				} else {
				
				return "/message";
				}
			}else {
				
				return "/message";
				
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return "redirect:/validar";
	}

}
