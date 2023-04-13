/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Cliente;
import java.util.List;

/**
 *
 * @author Lion
 */
public interface IClienteService{
    public List<Cliente> getAllcliente();
    public List<Cliente> getclienteByCedula(String cedula);
    public Cliente getclienteById (long id);
    public void savecliente(Cliente cliente);
    public void delete (long id);
    public Cliente findByNombre (String username);
}
