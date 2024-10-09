/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.security.*;
import com.abarrotes.service.*;
import com.abarrotes.entidad.Usuario;
import com.abarrotes.repository.UsuarioRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
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
    return User.builder().username(user.getUserName()).password(user.getContraseña()).roles(new String[]{"USER"}).build();
    
    }
}

