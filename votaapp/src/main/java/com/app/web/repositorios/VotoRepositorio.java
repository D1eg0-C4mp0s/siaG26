package com.app.web.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidad.Voto;

@Repository
public interface VotoRepositorio extends JpaRepository<Voto, Integer> {

	
	Voto findByIdentificacion(int identificacion);
	
}
