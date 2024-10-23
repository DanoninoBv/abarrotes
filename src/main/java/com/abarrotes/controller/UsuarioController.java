/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.entidad.Usuario;
import com.abarrotes.service.UsuarioService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import static org.aspectj.bridge.context.CompilationAndWeavingContext.reset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 *
 * @author world
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class UsuarioController implements Serializable{
    private static final long serialVersionUID = 1L;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private List<UsuarioDto> lstusuario;
    
    private UsuarioDto usuario;
    private UsuarioDto usuarioDelete;
    
    private String stateView = "init";
    
    @PostConstruct
    public void init() {
        lstusuario = usuarioService.findAll();
        reset();
        stateView = "init";
    }
    
    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        usuario = new UsuarioDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        usuario = new UsuarioDto();
    }

    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        usuario.setContraseña(passwordEncoder.encode(usuario.getContraseña()));
        if (usuario.getIdUsuarioPk() == null) {
            usuario.setFechaDeAlta(new Date());
            usuario.setEstatus('1');
            usuarioService.insert(usuario);
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Guardado", "Registro insertado correctamente"));
        } else {
            usuarioService.update(usuario);
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nuevo", "Nuevo registro"));
        }
        init();
//        return "usuario";///regresamos a la pantalla
    }

    public void delete() {
        usuarioDelete.setEstatus('0');
        usuarioService.delete(usuarioDelete);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Eliminar", "Registro eliminado"));
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<UsuarioDto> getLstusuario() {
        return lstusuario;
    }

    public void setLstcategoria(List<UsuarioDto> lstusuario) {
        this.lstusuario = lstusuario;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public UsuarioDto getUsuarioDelete() {
        return usuarioDelete;
    }

    public void setUsuarioDelete(UsuarioDto usuarioDelete) {
        this.usuarioDelete = usuarioDelete;
    }
    
   
}  
    
