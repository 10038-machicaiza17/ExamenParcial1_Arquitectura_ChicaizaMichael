package com.examen.grupo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.examen.grupo1.model.OfiInstitucion;
import com.examen.grupo1.repository.OfiInstitucionRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class InstitucionService {
    private final OfiInstitucionRepository ofiInstitucionRepository;

    public InstitucionService(OfiInstitucionRepository ofiInstitucionRepository) {
        this.ofiInstitucionRepository = ofiInstitucionRepository;
    }

    public List<OfiInstitucion> listarInstituciones() {
        return ofiInstitucionRepository.findAll();
    }

    public Optional<OfiInstitucion> obterInstitucionPorId(int id) {
        return ofiInstitucionRepository.findById(id);
    }

    public OfiInstitucion crearInstitucion(OfiInstitucion institucion) {
        return ofiInstitucionRepository.save(institucion);
    }

    public OfiInstitucion actualizar(int codigo, OfiInstitucion institucion) {
        return ofiInstitucionRepository.findById(codigo).map(entidadExistente -> {
            entidadExistente.setRuc(institucion.getRuc());
            entidadExistente.setRazonSocial(institucion.getRazonSocial());
            entidadExistente.setNombreComercial(institucion.getNombreComercial());
            return ofiInstitucionRepository.save(entidadExistente);
        }).orElseThrow(() -> new EntityNotFoundException("Institución con código " + codigo + " no encontrada."));
    }

    public void eliminarInstitucion(int id) {
        ofiInstitucionRepository.deleteById(id);
    }

}
