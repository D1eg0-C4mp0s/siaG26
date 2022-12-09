package com.app.web.controlador;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Votante;
import com.app.web.servicios.VotanteService;

@Controller
public class VotanteControlador {
	@Autowired
	private VotanteService votanteService;
	Votante objVot = new Votante();
	
	@PostMapping("/validar")
	public String valida(@Validated Votante votante, Model model) {
		try {
			Optional<Votante> objVotante = votanteService.findById(votante.getIdentificacion());
			
			if (objVotante.isEmpty()) {
				
				return "/message";
				
			} else {
				objVot = objVotante.get();
				if(objVot.getIdentificacion() == votante.getIdentificacion() && objVot.getClave().equals(votante.getClave())){
				model.addAttribute("voto", objVotante.get());
				return "/index";
			}else {
				
				return "/message";
				
			}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return "redirect:/validar";
	}

}
