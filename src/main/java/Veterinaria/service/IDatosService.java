/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.service;

import Veterinaria.entily.Datos;
import java.util.List;

/**
 *
 * @author aldav
 */
public interface IDatosService {
    
    public List<Datos> getAllDatos();
    
    public Datos getDatosById(long id);
    
    public void saveDatos(Datos datos);
    
    public void delete(long id);
    
}
