package com.examen.grupo1.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class OfiEdificioBloque implements Serializable{
    @NotNull
    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codigo;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO", nullable = false, updatable = false, insertable = false)
    private OfiEdificio ofiEdificio;
    @NotNull
    @Column(name = "NOMBRE_BLOQUE", length = 128, nullable = false)
    private String nombreBloque;
    @NotNull
    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String descripcion;

    public OfiEdificioBloque() {
    }

    public OfiEdificioBloque(@NotNull String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiEdificio getOfiEdificio() {
        return ofiEdificio;
    }

    public void setOfiEdificio(OfiEdificio ofiEdificio) {
        this.ofiEdificio = ofiEdificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        OfiEdificioBloque other = (OfiEdificioBloque) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificioBloque [codigo=" + codigo + ", ofiEdificio=" + ofiEdificio + ", nombreBloque=" + nombreBloque
                + ", descripcion=" + descripcion + "]";
    }

}
