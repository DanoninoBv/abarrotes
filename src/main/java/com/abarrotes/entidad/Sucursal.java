/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/*@author world*/
@Entity
@Table(name = "sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s"),
    @NamedQuery(name = "Sucursal.findByIdSucursalPk", query = "SELECT s FROM Sucursal s WHERE s.idSucursalPk = :idSucursalPk"),
    @NamedQuery(name = "Sucursal.findByNombre", query = "SELECT s FROM Sucursal s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Sucursal.findByDireccion", query = "SELECT s FROM Sucursal s WHERE s.direccion = :direccion"),
    @NamedQuery(name = "Sucursal.findByCp", query = "SELECT s FROM Sucursal s WHERE s.cp = :cp"),
    @NamedQuery(name = "Sucursal.findByTelefono", query = "SELECT s FROM Sucursal s WHERE s.telefono = :telefono"),
    @NamedQuery(name = "Sucursal.findByEstatus", query = "SELECT s FROM Sucursal s WHERE s.estatus = :estatus")})
public class Sucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sucursal_pk")
    private Integer idSucursalPk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "cp")
    private String cp;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "id_sucursal_fk")
    private Integer idEmpresaFk;

    public Sucursal() {
    }

    public Sucursal(Integer idSucursalPk) {
        this.idSucursalPk = idSucursalPk;
    }

    public Integer getIdSucursalPk() {
        return idSucursalPk;
    }

    public void setIdSucursalPk(Integer idSucursalPk) {
        this.idSucursalPk = idSucursalPk;
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Integer getIdEmpresaFk() {
        return idEmpresaFk;
    }

    public void setIdEmpresaFk(Integer idEmpresaFk) {
        this.idEmpresaFk = idEmpresaFk;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSucursalPk != null ? idSucursalPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.idSucursalPk == null && other.idSucursalPk != null) || (this.idSucursalPk != null && !this.idSucursalPk.equals(other.idSucursalPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Sucursal[ idSucursalPk=" + idSucursalPk + " ]";
    }
    
}
