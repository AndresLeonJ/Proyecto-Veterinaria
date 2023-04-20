/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Mascotas;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */

@Service
public interface IMascotaService {
  public List<Mascotas> getAllAnimales();

    public Mascotas getAnimalById(long id);
   
    public void guardarMascota(Mascotas animal);

    public void eliminarMascota(long id);

   
}
