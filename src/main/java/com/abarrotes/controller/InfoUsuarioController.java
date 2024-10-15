package com.abarrotes.controller;

import com.abarrotes.service.UsuarioService;
import com.abarrotes.dto.UsuarioDto;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Juan de la Cruz
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class InfoUsuarioController implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Logger logger = LoggerFactory.getLogger(InfoUsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;
    private UsuarioDto usuario;

    @PostConstruct
    public void init() {
        usuario = new UsuarioDto();
        usuario.setNombre("Usuario de Prueba");
//        usuario = usuarioService.();
//        if (usuario != null && usuario.getId() != null) {
//             = (usuario);
//            if (!usuario.().isEmpty()) {
//                usuario.setAllowedUrl(.getAllowedUrl(usuario.getRol().getIdRolPk()));
//
//            }
//        }

    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }
}
