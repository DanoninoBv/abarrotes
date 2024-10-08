/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author world
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findByIdCategoriaPk", query = "SELECT c FROM Categoria c WHERE c.idCategoriaPk = :idCategoriaPk"),
    @NamedQuery(name = "Categoria.findByNombre", query = "SELECT c FROM Categoria c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Categoria.findByEstatus", query = "SELECT c FROM Categoria c WHERE c.estatus = :estatus"),
    @NamedQuery(name = "Categoria.findByFechaAlta", query = "SELECT c FROM Categoria c WHERE c.fechaAlta = :fechaAlta")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_categoria_pk")
    private Integer idCategoriaPk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    public Categoria() {
    }

    public Categoria(Integer idCategoriaPk) {
        this.idCategoriaPk = idCategoriaPk;
    }

    public Integer getIdCategoriaPk() {
        return idCategoriaPk;
    }

    public void setIdCategoriaPk(Integer idCategoriaPk) {
        this.idCategoriaPk = idCategoriaPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaPk != null ? idCategoriaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.idCategoriaPk == null && other.idCategoriaPk != null) || (this.idCategoriaPk != null && !this.idCategoriaPk.equals(other.idCategoriaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Categoria[ idCategoriaPk=" + idCategoriaPk + " ]";
    }
    
}
