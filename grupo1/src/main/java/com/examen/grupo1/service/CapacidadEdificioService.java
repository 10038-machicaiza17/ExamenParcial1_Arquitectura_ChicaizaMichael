package com.examen.grupo1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.grupo1.model.OfiAula;
import com.examen.grupo1.repository.OfiAulaRepository;

public class CapacidadEdificioService {
    @Autowired
    private OfiAulaRepository ofiAulaRepository;

    public int calcularCapacidadTotal(String codigoSede, String codigoEdificio) {
        List<OfiAula> aulas = ofiAulaRepository.findByPkCodigoEdificioAndPkCodigoEdificioBloque(codigoEdificio, codigoSede);

        // Sumar la capacidad de todas las aulas
        return aulas.stream()
                    .mapToInt(OfiAula::getCapacidad)
                    .sum();
    }

}
