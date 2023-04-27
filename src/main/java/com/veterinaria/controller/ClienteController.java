
package com.veterinaria.controller;

import com.veterinaria.entity.Cliente;
import com.veterinaria.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    
    @Autowired
    private IClienteService clienteService;
  
    @GetMapping("/clientes")
    public String index(Model model) {
        List<Cliente> listaClientes = clienteService.buscarTodosLosClientes();
        model.addAttribute("titulo", "Tabla Clientes");
        model.addAttribute("clientes", listaClientes);
        return "clientes";
    }

    @GetMapping("/clienteNuevo")
    public String crearCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "crear-cliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.guardarCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editarCliente/{id}")
    public String editarCliente(@PathVariable("id") Long idCliente, Model model) {
        Cliente cliente = clienteService.buscarClientePorId(idCliente);
        model.addAttribute("cliente", cliente);
        return "crear-cliente";
    }

    @GetMapping("/eliminarCliente/{id}")
    public String eliminarCliente(@PathVariable("id") Long idCliente) {
        clienteService.eliminarCliente(idCliente);
        return "redirect:/clientes";
    }
    
}

    

