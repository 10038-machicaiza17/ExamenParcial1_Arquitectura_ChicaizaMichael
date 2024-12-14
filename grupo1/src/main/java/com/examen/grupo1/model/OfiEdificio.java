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
@Table(name = "OFI_EDIFICIO")
public class OfiEdificio implements Serializable{
    @NotNull
    @Id
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigo;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", nullable = false, updatable = false, insertable = false)
    private OfiSede ofiSede;
    @NotNull
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "COD_ALTERNO", length = 16, nullable = false)
    private String codigoAlterno;
    @NotNull
    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String descripcion;
    @NotNull
    @Column(name = "DIRECCION", length = 256, nullable = false)
    private String direccion;
    @NotNull
    @Column(name = "COMENTARIO", length = 1000, nullable = false)
    private String comentario;
    @NotNull
    @Column(name = "MANEJA_BLOQUES", nullable = false)
    private boolean manejaBloques;
    @NotNull
    @Column(name = "POSEE_AULAS", nullable = false)
    private boolean poseeAulas;
    @NotNull
    @Column(name = "PISOS", precision = 2, nullable = false)
    private int pisos;

    public OfiEdificio() {
    }

    public OfiEdificio(@NotNull String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiSede getOfiSede() {
        return ofiSede;
    }

    public void setOfiSede(OfiSede ofiSede) {
        this.ofiSede = ofiSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isManejaBloques() {
        return manejaBloques;
    }

    public void setManejaBloques(boolean manejaBloques) {
        this.manejaBloques = manejaBloques;
    }

    public boolean isPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
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
        OfiEdificio other = (OfiEdificio) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificio [codigo=" + codigo + ", ofiSede=" + ofiSede + ", nombre=" + nombre + ", codigoAlterno="
                + codigoAlterno + ", descripcion=" + descripcion + ", direccion=" + direccion + ", comentario="
                + comentario + ", manejaBloques=" + manejaBloques + ", poseeAulas=" + poseeAulas + ", pisos=" + pisos
                + "]";
    }

}
