/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.controller;

import com.veterinaria.entity.Mascotas;
import com.veterinaria.repository.AnimalRepository;
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
public class AnimalController {
    
    @Autowired
    private IMascotaService MascotaService;

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animales")
    public String index(Model model) {
        List<Mascotas> listaAnimales = (List<Mascotas>) animalRepository.findAll();
        model.addAttribute("titulo", "Lista de animales");
        model.addAttribute("animales", listaAnimales);
        return "animales";
    }

    @GetMapping("/animal")
    public String crearAnimal(Model model) {
        model.addAttribute("animal", new Mascotas());
        return "crearAnimal";
    }

    @PostMapping("/animal")
    public String guardarAnimal(@ModelAttribute Mascotas animal) {
        animalRepository.save(animal);
        return "redirect:/animales";
    }

    @GetMapping("/editarAnimal/{id}")
    public String editarAnimal(@PathVariable("id") Long idAnimal, Model model) {
        Mascotas animal = animalRepository.findById(idAnimal).orElseThrow(() -> new RuntimeException("Animal no encontrado"));
        model.addAttribute("animal", animal);
        return "crearAnimal";
    }

    @GetMapping("/eliminarAnimal/{id}")
    public String eliminarAnimal(@PathVariable("id") Long idAnimal) {
        Mascotas animal = animalRepository.findById(idAnimal).orElseThrow(() -> new RuntimeException("Animal no encontrado"));
        animalRepository.delete(animal);
        return "redirect:/animales";
    }
}
