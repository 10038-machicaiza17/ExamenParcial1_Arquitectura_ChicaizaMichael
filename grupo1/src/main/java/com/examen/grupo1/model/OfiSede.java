package com.examen.grupo1.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "OFI_SEDE")
public class OfiSede implements Serializable {
    @NotNull
    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codigo;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", nullable = false, updatable = false, insertable = false)
    private OfiInstitucion ofiInstitucion;
    @NotNull
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "DIRECCION", length = 128, nullable = false)
    private String direccion;
    @NotNull
    @Column(name = "ES_PRINCIPAL", nullable = false)
    private boolean esPrincipal;
    @NotNull
    @Column(name = "PRESUPUESTO", precision = 18, scale = 2, nullable = false)
    private BigDecimal presupuesto;

    public OfiSede() {
    }

    public OfiSede(@NotNull String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiInstitucion getOfiInstitucion() {
        return ofiInstitucion;
    }

    public void setOfiInstitucion(OfiInstitucion ofiInstitucion) {
        this.ofiInstitucion = ofiInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
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
        OfiSede other = (OfiSede) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiSede [codigo=" + codigo + ", ofiInstitucion=" + ofiInstitucion + ", nombre=" + nombre
                + ", direccion=" + direccion + ", esPrincipal=" + esPrincipal + ", presupuesto=" + presupuesto + "]";
    }

}
