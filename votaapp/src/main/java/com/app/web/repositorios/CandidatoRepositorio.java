package com.app.web.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Candidato;

@Repository
public interface CandidatoRepositorio extends JpaRepository<Candidato, Integer>  {

}
