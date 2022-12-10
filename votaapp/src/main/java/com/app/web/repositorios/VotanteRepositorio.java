package com.app.web.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Votante;

@Repository
public interface VotanteRepositorio extends JpaRepository<Votante, Integer> {

}
