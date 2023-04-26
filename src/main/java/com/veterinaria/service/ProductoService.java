/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Producto;
import com.veterinaria.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Lion
 */
@Service
public class ProductoService implements IProductoService {
     @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto getProductoById(long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto findByMarca(String marca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProducto(Producto producto) {
       Producto productoExistente = productoRepository.findById(producto.getId()).orElse(null);
    if (productoExistente != null) {
        productoExistente.setMarca(producto.getMarca());
        productoExistente.setDescripcion(producto.getDescripcion());
        productoExistente.setPrecio(producto.getPrecio());
        productoRepository.save(productoExistente);
    }

   
    }  
}
