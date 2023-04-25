package com.veterinaria.service;

import com.veterinaria.entity.Cliente;
import com.veterinaria.repository.ClienteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> buscarTodosLosClientes() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public void eliminarCliente(long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente buscarClientePorId(long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

}
