package com.app.web.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Candidato;
@Repository

public interface CandidatoService extends JpaRepository<Candidato, Integer>  {

}
