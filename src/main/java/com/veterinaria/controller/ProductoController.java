/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.controller;

import com.veterinaria.entity.Producto;
import com.veterinaria.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Producto> listaProductos = productoService.getAllProductos();
        model.addAttribute("titulo", "Tabla de Productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }

    @GetMapping("/nuevoProducto")
    public String crearProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "crear-producto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.crearProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editarProducto/{id}")
    public String editarProducto(@PathVariable("id") Long idProducto, Model model) {
        Producto producto = productoService.getProductoById(idProducto);
        model.addAttribute("producto", producto);
        return "crear-producto";
    }

    @GetMapping("/eliminarProducto/{id}")
    public String eliminarProducto(@PathVariable("id") Long idProducto) {
        productoService.delete(idProducto);
        return "redirect:/productos";
    }

    
}
