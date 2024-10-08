/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;

import com.abarrotes.entidad.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author world
 */
public class EmpresaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idEmpresaPk;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private BigInteger numeroDeUsuarios;
    private String nombreComercial;
    private String logo;
    private String representanteLegal;
    private Character envioDeMensajes;
    private String passwordCorreo;
    private String usuarioCorreo;
    private String host;
    private String puerto;
    private String token;
    private String instancia;
    private Character estatus;
    private List<Sucursal> sucursalList;

    public EmpresaDto() {
    }

    public EmpresaDto(Integer idEmpresaPk) {
        this.idEmpresaPk = idEmpresaPk;
    }

    public Integer getIdEmpresaPk() {
        return idEmpresaPk;
    }

    public void setIdEmpresaPk(Integer idEmpresaPk) {
        this.idEmpresaPk = idEmpresaPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public void setNumeroDeUsuarios(BigInteger numeroDeUsuarios) {
        this.numeroDeUsuarios = numeroDeUsuarios;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Character getEnvioDeMensajes() {
        return envioDeMensajes;
    }

    public void setEnvioDeMensajes(Character envioDeMensajes) {
        this.envioDeMensajes = envioDeMensajes;
    }

    public String getPasswordCorreo() {
        return passwordCorreo;
    }

    public void setPasswordCorreo(String passwordCorreo) {
        this.passwordCorreo = passwordCorreo;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public List<Sucursal> getSucursalList() {
        return sucursalList;
    }

    public void setSucursalList(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaPk != null ? idEmpresaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaDto)) {
            return false;
        }
        EmpresaDto other = (EmpresaDto) object;
        if ((this.idEmpresaPk == null && other.idEmpresaPk != null) || (this.idEmpresaPk != null && !this.idEmpresaPk.equals(other.idEmpresaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Empresa[ idEmpresaPk=" + idEmpresaPk + " ]";
    }
    
}
