package com.examen.grupo1.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "OFI_AULA")
public class OfiAula implements Serializable{
    @NotNull
    @EmbeddedId
    private OfiAulaPK pk;
    @NotNull
    @Column(name = "COD_ALTERNO", length = 10, nullable = false)
    private String codAlterno;
    @NotNull
    @Column(name = "CAPACIDAD", precision = 4, nullable = false)
    private int capacidad;
    @NotNull
    @Column(name = "PISO", precision = 2, nullable = false)
    private int piso;
    @NotNull
    @Column(name = "FECHA_CREACION", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaCreacion;
    @NotNull
    @Column(name = "ESTADO", length = 1, nullable = false)

}
