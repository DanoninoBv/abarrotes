/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.repository;

import com.abarrotes.entidad.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author world
 */

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
   public Optional<Usuario> findByUserName (String userName); 
}
