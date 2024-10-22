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

public class UsuarioService implements UserDetailsService, Serializable {

    @Autowired
    UsuarioRepository usuarioRepository;

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
            userD = convertirEntidadADTO(user);

            // Seteamos el menú
//        userD.setMenu(menuService.ConstuctMenu(user.getIdRolFk().getIdRolPk()));
            // Seteamos Rol
//        userD.setRol(new Rol(user.getIdRolFk().getIdRolPk(), user.getIdRolFk().getNombreRol(), user.getIdRolFk().getDescripcionRol()));
        }

        return userD;
    }
    
    private UsuarioDto convertirEntidadADTO(Usuario usuario){
        UsuarioDto u = new UsuarioDto();
        u.setIdUsuarioPk(usuario.getIdUsuarioPk());
        u.setIdSucursalFk(usuario.getIdSucursalFk());
        u.setNombre(usuario.getNombre());
        u.setUserName(usuario.getUserName());
        
        
        
        return u;
    }
}
