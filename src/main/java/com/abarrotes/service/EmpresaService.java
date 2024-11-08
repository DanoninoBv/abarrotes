/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.EmpresaDto;
import com.abarrotes.entidad.Empresa;
import com.abarrotes.repository.EmpresaRepository;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */
@Service

public class EmpresaService implements UserDetailsService {
    
    @Autowired
    EmpresaRepository empresaRepository;
    
    public List<EmpresaDto> findAllNativo() {
        List<EmpresaDto> lstEmpresaDto = new ArrayList<>();
        List<Empresa> lstEmpresa = empresaRepository.findAllNativo();
        for (Empresa e : lstEmpresa) {
            EmpresaDto ed = converterEntidadDto(e);
            lstEmpresaDto.add(ed);
        }
        return lstEmpresaDto;
    }
    
    public EmpresaDto insert(EmpresaDto e) {
        return converterEntidadDto(empresaRepository.save(converterDtoEntidad(e)));
        
    }
    
    public EmpresaDto update(EmpresaDto e) {
        return converterEntidadDto(empresaRepository.save(converterDtoEntidad(e)));
        
    }
    
    public EmpresaDto findByIdUsuario(Integer idUsuario) {
        EmpresaDto e = new EmpresaDto();
//        Empresa emp = empresaRepository.findByIdUsuario(idUsuario);
//        e = converterEntidadDto(emp);
//
//        return e;
        List<Object[]> lstO = empresaRepository.findByIdUsuario(idUsuario);
        
        for (Object[] o : lstO) {
            e.setIdEmpresaPk(Integer.parseInt(o[0].toString()));
            e.setNombre(o[1].toString());
            e.setCorreo(o[2].toString());
            e.setDireccion(o[2] == null ? null:o[2].toString());
            
        }
        
        return e;
    }
    
    public int delete(EmpresaDto e) {
//        return empresaRepository.delete(e.getIdEmpresaPk(), '0');
        return 0;
    }
    
    private EmpresaDto converterEntidadDto(Empresa e) {
        EmpresaDto empresaDto = new EmpresaDto();
        empresaDto.setCorreo(e.getCorreo());
        empresaDto.setDireccion(e.getDireccion());
        empresaDto.setEnvioDeMensajes(e.getEnvioDeMensajes());
        empresaDto.setEstatus(e.getEstatus());
        empresaDto.setHost(e.getHost());
        empresaDto.setIdEmpresaPk(e.getIdEmpresaPk());
        empresaDto.setInstancia(e.getInstancia());
        empresaDto.setLogo(e.getLogo());
        empresaDto.setNombre(e.getNombre());
        empresaDto.setNombreComercial(e.getNombreComercial());
        empresaDto.setNumeroDeUsuarios(e.getNumeroDeUsuarios());
        empresaDto.setPasswordCorreo(e.getPasswordCorreo());
        empresaDto.setPuerto(e.getPuerto());
        empresaDto.setRepresentanteLegal(e.getRepresentanteLegal());
        empresaDto.setSucursalList(e.getSucursalList());
        empresaDto.setTelefono(e.getTelefono());
        empresaDto.setToken(e.getToken());
        empresaDto.setUsuarioCorreo(e.getUsuarioCorreo());
        
        return empresaDto;
    }
    
    private Empresa converterDtoEntidad(EmpresaDto e) {
        Empresa empresa = new Empresa();
        empresa.setCorreo(e.getCorreo());
        empresa.setDireccion(e.getDireccion());
        empresa.setEnvioDeMensajes(e.getEnvioDeMensajes());
        empresa.setEstatus(e.getEstatus());
        empresa.setHost(e.getHost());
        empresa.setIdEmpresaPk(e.getIdEmpresaPk());
        empresa.setInstancia(e.getInstancia());
        empresa.setLogo(e.getLogo());
        empresa.setNombre(e.getNombre());
        empresa.setNombreComercial(e.getNombreComercial());
        empresa.setNumeroDeUsuarios(e.getNumeroDeUsuarios());
        empresa.setPasswordCorreo(e.getPasswordCorreo());
        empresa.setPuerto(e.getPuerto());
        empresa.setRepresentanteLegal(e.getRepresentanteLegal());
        empresa.setSucursalList(e.getSucursalList());
        empresa.setTelefono(e.getTelefono());
        empresa.setToken(e.getToken());
        empresa.setUsuarioCorreo(e.getUsuarioCorreo());
        
        return empresa;
    }

//    public void insert(EmpresaDto empresa) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public void update(EmpresaDto empresa) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public void delete(EmpresaDto empresaDelete) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
