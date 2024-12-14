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
    private String codEdificio;
    @NotNull
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codEdificioBloque;

    public OfiAulaPK() {
    }

    public OfiAulaPK(@NotNull int codigo, @NotNull String codEdificio, @NotNull String codEdificioBloque) {
        this.codigo = codigo;
        this.codEdificio = codEdificio;
        this.codEdificioBloque = codEdificioBloque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((codEdificio == null) ? 0 : codEdificio.hashCode());
        result = prime * result + ((codEdificioBloque == null) ? 0 : codEdificioBloque.hashCode());
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
        if (codEdificio == null) {
            if (other.codEdificio != null)
                return false;
        } else if (!codEdificio.equals(other.codEdificio))
            return false;
        if (codEdificioBloque == null) {
            if (other.codEdificioBloque != null)
                return false;
        } else if (!codEdificioBloque.equals(other.codEdificioBloque))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiAulaPK [codigo=" + codigo + ", codEdificio=" + codEdificio + ", codEdificioBloque="
                + codEdificioBloque + "]";
    }

}
