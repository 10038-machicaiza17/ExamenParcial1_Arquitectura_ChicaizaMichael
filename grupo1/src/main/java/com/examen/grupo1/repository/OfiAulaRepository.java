package com.examen.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examen.grupo1.model.OfiAula;
import com.examen.grupo1.model.OfiAulaPK;

public interface OfiAulaRepository extends JpaRepository<OfiAula, OfiAulaPK> {

    List<OfiAula> findByPkCodigoEdificioAndPkCodigoEdificioBloque(String codigoEdificio, String codigoSede);

}
