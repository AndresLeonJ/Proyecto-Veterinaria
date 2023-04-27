/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.service;

import Veterinaria.entily.FormAdoptar;
import Veterinaria.entily.FormDarAdop;
import java.util.List;

/**
 *
 * @author aldav
 */
public interface IFormDarAdopService {
    
    public List<FormDarAdop> getAllFormDarAdop();

    public FormDarAdop getFormDarAdopByCedula(long cedula);

    public void saveFormDarAdop(FormDarAdop formDarAdoptar);

    public void delete(long cedula);
    
   

    
    
}
