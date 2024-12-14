package com.examen.grupo1.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "OFI_AULA")
public class OfiAula implements Serializable {
    @NotNull
    @EmbeddedId
    private OfiAulaPK pk;
    @NotNull
    @Column(name = "COD_ALTERNO", length = 10, nullable = false)
    private String codigoAlterno;
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
    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaUltimaActualizacion;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO", nullable = false, updatable = false, insertable = false)
    private OfiEdificio ofiEdificio;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO_BLOQUE", referencedColumnName = "COD_EDIFICIO_BLOQUE", nullable = false, updatable = false, insertable = false)
    private OfiEdificioBloque ofiEdificioBloque;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", referencedColumnName = "COD_TIPO_AULA", nullable = false, updatable = false, insertable = false)
    private OfiTipoAula ofiTipoAula;

    public OfiAula() {
    }

    public OfiAula(@NotNull OfiAulaPK pk) {
        this.pk = pk;
    }

    public OfiAulaPK getPk() {
        return pk;
    }

    public void setPk(OfiAulaPK pk) {
        this.pk = pk;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public OfiEdificio getOfiEdificio() {
        return ofiEdificio;
    }

    public void setOfiEdificio(OfiEdificio ofiEdificio) {
        this.ofiEdificio = ofiEdificio;
    }

    public OfiEdificioBloque getOfiEdificioBloque() {
        return ofiEdificioBloque;
    }

    public void setOfiEdificioBloque(OfiEdificioBloque ofiEdificioBloque) {
        this.ofiEdificioBloque = ofiEdificioBloque;
    }

    public OfiTipoAula getOfiTipoAula() {
        return ofiTipoAula;
    }

    public void setOfiTipoAula(OfiTipoAula ofiTipoAula) {
        this.ofiTipoAula = ofiTipoAula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OfiAula other = (OfiAula) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiAula [pk=" + pk + ", codigoAlterno=" + codigoAlterno + ", capacidad=" + capacidad + ", piso=" + piso
                + ", fechaCreacion=" + fechaCreacion + ", fechaUltimaActualizacion=" + fechaUltimaActualizacion
                + ", ofiEdificio=" + ofiEdificio + ", ofiEdificioBloque=" + ofiEdificioBloque + ", ofiTipoAula="
                + ofiTipoAula + "]";
    }

}
