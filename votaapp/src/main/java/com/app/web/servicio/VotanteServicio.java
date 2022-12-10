package com.app.web.servicio;

import com.app.web.entidad.Votante;
import com.app.web.votante.dto.VotanteRegistroDTO;

public interface VotanteServicio {
	public Votante guardar(VotanteRegistroDTO registroDTO);
}
