
package com.veterinaria.controller;

import com.veterinaria.entity.Mascotas;
import com.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;
    
   

    @GetMapping("/mascotas")
    public String index(Model model) {
        List<Mascotas> listaMascotas = mascotaService.getAllAnimales();
        model.addAttribute("titulo", "Tabla de Mascotas");
        model.addAttribute("mascotas", listaMascotas);
        return "mascotas";
    }

    @GetMapping("/mascotaNueva")
    public String crearMascota(Model model) {
        model.addAttribute("mascota", new Mascotas());
        return "crear-mascota";
    }
    
    
    @PostMapping("/guardarMascota")
    public String guardarMascota(@ModelAttribute Mascotas mascota) {
        mascotaService.guardarMascota(mascota);
        return "redirect:/mascotas";
    }

    @GetMapping("/editarMascota/{id}")
    public String editarMascota(@PathVariable("id") Long idMascota, Model model) {
        Mascotas mascota = mascotaService.getAnimalById(idMascota);
        model.addAttribute("mascota", mascota);
        return "crear-mascota";
    }

    @GetMapping("/eliminarMascota/{id}")
    public String eliminarMascota(@PathVariable("id") Long idMascota) {
        mascotaService.eliminarMascota(idMascota);
        return "redirect:/mascotas";
    }
}