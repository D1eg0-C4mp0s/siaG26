package com.app.web.controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Voto;
import com.app.web.repositorios.VotoRepositorio;

@Controller
public class VotoControlador {

@Autowired
	private VotoRepositorio votoRepositorio;

	@PostMapping("/voto")
	public String regVoto(@Validated Voto voto, Model model) {
		String retorno = "";

		try {
			Voto objVoto = votoRepositorio.findByIdentificacion(voto.getIdentificacion());

			if (objVoto != null) {

				retorno = "/message_vot";
			} else {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date = dateFormat.format(new java.util.Date());
				System.out.println("Fecha: " + date);

				voto.setFechaHora(date);
				votoRepositorio.save(voto);
				retorno = "/message_fin";

			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return retorno;

	}

	
}
