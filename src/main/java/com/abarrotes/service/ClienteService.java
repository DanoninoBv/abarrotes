/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;


import com.abarrotes.dto.ClienteDto;
import com.abarrotes.entidad.Cliente;
import com.abarrotes.repository.ClienteRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class ClienteService {
    @Autowired 
ClienteRepository clienteRepository;
    public List<ClienteDto> findAll(){
    List<ClienteDto> lstClienteDto = new ArrayList<>();   
    List <Cliente> lstCliente = clienteRepository.findAll();
    for (Cliente c : lstCliente){
        ClienteDto cd = converterEntidadDto(c);
        lstClienteDto.add(cd);
    }
    return lstClienteDto;
}
    public ClienteDto insert(ClienteDto c){
        return converterEntidadDto(clienteRepository.save(converterDtoEntidad(c)));
    }
    
    public ClienteDto update(ClienteDto c){
        return converterEntidadDto(clienteRepository.save(converterDtoEntidad(c)));
    }
    public int delete(ClienteDto c){
        return clienteRepository.delete(c.getIdClientePk(), '0');
    }
    
    private ClienteDto converterEntidadDto (Cliente c){
    ClienteDto clienteDto = new ClienteDto();
    clienteDto.setCorreo(c.getCorreo());
    clienteDto.setCp(c.getCp());
    clienteDto.setDiasCredito(c.getDiasCredito());
    clienteDto.setDireccion(c.getDireccion());
    clienteDto.setEmpresa(c.getEmpresa());
    clienteDto.setEstatus(c.getEstatus());
    clienteDto.setFechaAlta(c.getFechaAlta());
    clienteDto.setFormaPago(c.getFormaPago());
    clienteDto.setIdClientePk(c.getIdClientePk());
    clienteDto.setIdEmpresaFk(c.getIdEmpresaFk());
    clienteDto.setIdUsuarioFk(c.getIdUsuarioFk());
    clienteDto.setIdVendedorFk(c.getIdVendedorFk());
    clienteDto.setMandarMebsajePromocion(c.getMandarMebsajePromocion());
    clienteDto.setMetodoPago(c.getMetodoPago());
    clienteDto.setMontoCredito(c.getMontoCredito());
    clienteDto.setNombre(c.getNombre());
    clienteDto.setPais(c.getPais());
    clienteDto.setRegimen(c.getRegimen());
    clienteDto.setRfc(c.getRfc());
    clienteDto.setSexo(c.getSexo());
    clienteDto.setTelefonoCelular(c.getTelefonoCelular());
    clienteDto.setTelefonoFijo(c.getTelefonoFijo());
    clienteDto.setTipoPersona(c.getTipoPersona());
    
    return clienteDto;
    }
    
    private Cliente  converterDtoEntidad (ClienteDto c){
    Cliente cliente = new Cliente();
    cliente.setCorreo(c.getCorreo());
    cliente.setCp(c.getCp());
    cliente.setDiasCredito(c.getDiasCredito());
    cliente.setDireccion(c.getDireccion());
    cliente.setEmpresa(c.getEmpresa());
    cliente.setEstatus(c.getEstatus());
    cliente.setFechaAlta(c.getFechaAlta());
    cliente.setFormaPago(c.getFormaPago());
    cliente.setIdClientePk(c.getIdClientePk());
    cliente.setIdEmpresaFk(c.getIdEmpresaFk());
    cliente.setIdUsuarioFk(c.getIdUsuarioFk());
    cliente.setIdVendedorFk(c.getIdVendedorFk());
    cliente.setMandarMebsajePromocion(c.getMandarMebsajePromocion());
    cliente.setMetodoPago(c.getMetodoPago());
    cliente.setMontoCredito(c.getMontoCredito());
    cliente.setNombre(c.getNombre());
    cliente.setPais(c.getPais());
    cliente.setRegimen(c.getRegimen());
    cliente.setRfc(c.getRfc());
    cliente.setSexo(c.getSexo());
    cliente.setTelefonoCelular(c.getTelefonoCelular());
    cliente.setTelefonoFijo(c.getTelefonoFijo());
    cliente.setTipoPersona(c.getTipoPersona());
    
    return cliente;
    }

    /**
     *
     * @param clienteDelete
     */
    
    }
    

 