package com.app.web.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Votante;
import com.app.web.repositorios.VotanteRepositorio;
import com.app.web.votante.dto.VotanteRegistroDTO;

@Service
public class VotanteServicioImpl implements VotanteServicio{

	@Autowired
	private VotanteRepositorio votanteRepositorio;

	@Override
	public Votante guardar(VotanteRegistroDTO registroDTO) {
		Votante votante = new Votante(registroDTO.getIdentificacion(), registroDTO.getNombres(), registroDTO.getClave(), registroDTO.getTelefono(), registroDTO.getCorreo());
		return votanteRepositorio.save(votante);
	}
}
