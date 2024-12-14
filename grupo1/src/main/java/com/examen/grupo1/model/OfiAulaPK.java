package com.examen.grupo1.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class OfiAulaPK implements Serializable {
    @NotNull
    @Column(name = "COD_AULA", nullable = false)
    private int codigo;
    @NotNull
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigoEdificio;
    @NotNull
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codigoEdificioBloque;

    public OfiAulaPK() {
    }

    public OfiAulaPK(@NotNull int codigo, @NotNull String codigoEdificio, @NotNull String codigoEdificioBloque) {
        this.codigo = codigo;
        this.codigoEdificio = codigoEdificio;
        this.codigoEdificioBloque = codigoEdificioBloque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public void setCodigoEdificio(String codigoEdificio) {
        this.codigoEdificio = codigoEdificio;
    }

    public String getCodigoEdificioBloque() {
        return codigoEdificioBloque;
    }

    public void setCodigoEdificioBloque(String codigoEdificioBloque) {
        this.codigoEdificioBloque = codigoEdificioBloque;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((codigoEdificio == null) ? 0 : codigoEdificio.hashCode());
        result = prime * result + ((codigoEdificioBloque == null) ? 0 : codigoEdificioBloque.hashCode());
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
        OfiAulaPK other = (OfiAulaPK) obj;
        if (codigo != other.codigo)
            return false;
        if (codigoEdificio == null) {
            if (other.codigoEdificio != null)
                return false;
        } else if (!codigoEdificio.equals(other.codigoEdificio))
            return false;
        if (codigoEdificioBloque == null) {
            if (other.codigoEdificioBloque != null)
                return false;
        } else if (!codigoEdificioBloque.equals(other.codigoEdificioBloque))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiAulaPK [codigo=" + codigo + ", codigoEdificio=" + codigoEdificio + ", codigoEdificioBloque="
                + codigoEdificioBloque + "]";
    }

}
