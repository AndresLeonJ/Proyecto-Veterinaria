/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Reserva;
import com.veterinaria.entity.Cliente;
import com.veterinaria.repository.ClienteRepository;
import com.veterinaria.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lion
 */
@Service
public class ClienteService implements IClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllcliente() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public List<Cliente> getclienteByCedula(String cedula) {
        return (List<Cliente>) clienteRepository.findByCedula(cedula);
    }

    @Override
    public Cliente getclienteById(long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void savecliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void delete(long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findByNombre(String username) {
        return clienteRepository.findByNombre(username);
    }
    
    
}
