/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.security.*;
import com.abarrotes.service.*;
import com.abarrotes.entidad.Usuario;
import com.abarrotes.repository.UsuarioRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */
@Service


public class UsuarioService implements UserDetailsService{
    @Autowired 
    UsuarioRepository usuarioRepository;

    public List<UsuarioDto> findAll(){
        List<UsuarioDto> lstUsuarioDto = new ArrayList<>();
        List<Usuario> lstUsuario = usuarioRepository.findAll();
        for (Usuario u : lstUsuario) {
            UsuarioDto ud = converterEntidadDto(u);
            lstUsuarioDto.add(ud);
        }
        return lstUsuarioDto;
    }
    public UsuarioDto insert(UsuarioDto u) {
        return converterEntidadDto(usuarioRepository.save(converterEntidad(u)));

    }
    
    public UsuarioDto update(UsuarioDto u) {
        return converterEntidadDto(usuarioRepository.save(converterEntidad(u)));

    }
    
    public int delete(UsuarioDto u){
        return usuarioRepository.delete(u.getIdUsuarioPk(), '0');
    }
    
    private UsuarioDto converterEntidadDto (Usuario u){
    UsuarioDto usuarioDto = new UsuarioDto();
    usuarioDto.setApellidoMaterno(u.getApellidoMaterno());
    usuarioDto.setApellidoPaterno(u.getApellidoPaterno());
    usuarioDto.setContraseña(u.getContraseña());
    usuarioDto.setCorreo(u.getCorreo());
    usuarioDto.setCp(u.getCp());
    usuarioDto.setDireccion(u.getDireccion());
    usuarioDto.setEstatus(u.getEstatus());
    usuarioDto.setFechaDeAlta(u.getFechaDeAlta());
    usuarioDto.setFechaNac(u.getFechaNac());
    usuarioDto.setGenero(u.getGenero());
    usuarioDto.setIdSucursalFk(u.getIdSucursalFk());
    usuarioDto.setIdUsuarioPk(u.getIdUsuarioPk());
    usuarioDto.setNombre(u.getNombre());
    usuarioDto.setSueldo(u.getSueldo());
    usuarioDto.setTelefono(u.getTelefono());
    usuarioDto.setUrlFoto(u.getUrlFoto());
    usuarioDto.setUserName(u.getUserName());
    
    return usuarioDto;
    }
    
    private Usuario converterEntidad (UsuarioDto u){
    Usuario usuario = new Usuario();
    usuario.setApellidoMaterno(u.getApellidoMaterno());
    usuario.setApellidoPaterno(u.getApellidoPaterno());
    usuario.setContraseña(u.getContraseña());
    usuario.setCorreo(u.getCorreo());
    usuario.setCp(u.getCp());
    usuario.setDireccion(u.getDireccion());
    usuario.setEstatus(u.getEstatus());
    usuario.setFechaDeAlta(u.getFechaDeAlta());
    usuario.setFechaNac(u.getFechaNac());
    usuario.setGenero(u.getGenero());
    usuario.setIdSucursalFk(u.getIdSucursalFk());
    usuario.setIdUsuarioPk(u.getIdUsuarioPk());
    usuario.setNombre(u.getNombre());
    usuario.setSueldo(u.getSueldo());
    usuario.setTelefono(u.getTelefono());
    usuario.setUrlFoto(u.getUrlFoto());
    usuario.setUserName(u.getUserName());
    
    return usuario;
    }

     @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + userName));
        return User.builder().username(user.getUserName()).password(user.getContraseña()).roles(new String[]{"ADMIN"}).build();

    }

    public UsuarioDto getUsuarioAutenticadoMenu() {
        UserDetails usuarioActual = null;
        UsuarioDto userD = null;
        Usuario user = null;
        SecurityContext context = SecurityContextHolder.getContext();

        if (context != null) {
            Authentication auth = context.getAuthentication();
            if (auth != null && !auth.getPrincipal().equals("anonymousUser")) {
                usuarioActual = (UserDetails) auth.getPrincipal();
                System.out.println("Usuario autenticado: " + usuarioActual.getUsername());

                // Volvemos a realizar la búsqueda del usuario por la clave del usuario
                user = usuarioRepository.findByUserName(usuarioActual.getUsername())
                        .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado. "));
            } else {
                System.out.println("Autenticación no válida o usuario anónimo.");
            }
        } else {
            System.out.println("SecurityContext es nulo.");
        }

        if (user != null && user.getIdUsuarioPk() != null) {
            userD = converterEntidadDto(user);

            // Seteamos el menú
//        userD.setMenu(menuService.ConstuctMenu(user.getIdRolFk().getIdRolPk()));
            // Seteamos Rol
//        userD.setRol(new Rol(user.getIdRolFk().getIdRolPk(), user.getIdRolFk().getNombreRol(), user.getIdRolFk().getDescripcionRol()));
        }

        return userD;
    }
    
    
}
