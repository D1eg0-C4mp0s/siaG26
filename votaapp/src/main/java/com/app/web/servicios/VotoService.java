package com.app.web.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Voto;
@Repository

public interface VotoService extends JpaRepository<Voto, Integer> {

	
	Voto findByIdentificacion(int identificacion);
	
	//@Query("SELECT COUNT(idenCandidato) FROM voto")
	//int totalVotos();
	
	
	
}
