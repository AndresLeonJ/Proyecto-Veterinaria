/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Cliente;
import java.util.List;


public interface IClienteService{
   public void  guardarCliente(Cliente cliente);
    public void eliminarCliente(long id);
    public Cliente buscarClientePorId(long id);
   public List<Cliente> buscarTodosLosClientes();
   
}
   
 
