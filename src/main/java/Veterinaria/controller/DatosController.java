/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.controller;

import Veterinaria.entily.Datos;
import Veterinaria.service.IDatosService;
import ch.qos.logback.core.model.Model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aldav
 */
@Controller
public class DatosController {
    
    @Autowired
    
    private IDatosService datosService;
    
    @GetMapping("/formulario")
    
    public String index(Model model){
        List<Datos> listaDatos =datosService.getAllDatos();
        model.addAttribute("titulo","Tabla Datos Mascotas");
        model.addAttribute("datos",listaDatos);
        return "formulario";
    
    }
    
    @GetMapping("/formularioN")
    public String crearDatos(Model model){
        
        List<Datos> listaDatos =datosService.listCountry();
        model.addAttribute("datos",new Datos());
        model.addAttribute("paises", listaDatos);
        return "FormularioAdopcion";
       
    }
    @GetMapping("/delete/{id}")
    public String eliminarDatos(@PathVariable("id") Long idDatos) {
        datosService.delete(idDatos);
        return "redirect:/formulario";

    }
    @PostMapping("/save")
    public String guardarDatos(@ModelAttribute Datos datos) {
        datosService.saveDatos(datos);
        return "redirect: /formulario";

    }

    /*Metodo para editar*/
    @GetMapping("/editDatos/{id}")
    public String editarDatos(@PathVariable("id") Long idDatos, org.springframework.ui.Model model) {
        Datos datos = datosService.getDatosById(idDatos);
        List<Datos> listaformulario = datosService.listCountry();
        model.addAttribute("Datos", datos);
        model.addAttribute("Datos", listaformulario);
        return "FormularioAdopcion";

    }
    
    
    
    
}
