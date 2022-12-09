package com.app.web.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Votante;
@Repository
public interface VotanteService extends JpaRepository<Votante, Integer> {

}
