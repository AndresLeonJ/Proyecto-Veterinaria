/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Producto;
import com.veterinaria.entity.Reserva;
import java.util.List;

/**
 *
 * @author Lion
 */
public interface IProductoService {
    public List<Producto> getAllProductos();
    public Producto getProductoById (long id);
    public void saveProducto(Producto productos);
    public void delete (long id);
    public Producto findByMarca (String marca);
}
