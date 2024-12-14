package com.examen.grupo1.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "OFI_INSTITUCION")
public class OfiInstitucion implements Serializable{

    @NotNull
    @Id
    @Column(name = "COD_INSTITUCION", precision = 3, nullable = false)
    private int codigo;
    @NotNull
    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;
    @NotNull
    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;
    @NotNull
    @Column(name = "NOMBRE_COMERCIAL", length = 250, nullable = false)
    private String nombreComercial;

    public OfiInstitucion() {
    }

    public OfiInstitucion(@NotNull int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
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
        OfiInstitucion other = (OfiInstitucion) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiInstitucion [codigo=" + codigo + ", ruc=" + ruc + ", razonSocial=" + razonSocial
                + ", nombreComercial=" + nombreComercial + "]";
    }

}
