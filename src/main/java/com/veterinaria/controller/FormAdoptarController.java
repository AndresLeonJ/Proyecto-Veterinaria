
//import Veterinaria.entily.FormAdoptar;
//
//import Veterinaria.service.IFormAdoptarService;
//
//import ch.qos.logback.core.model.Model;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///**
// *
// * @author aldav
// */
//@Controller
//public class FormAdoptarController {
//
//    @Autowired
//
//    /*permite resolver la inyección de dependencias de los siguiente modos. En el constructor de la clase. En un atributo. En un método setter.*/
//    private IFormAdoptarService iformadoptarService;
//
//    @GetMapping("/AplicarAdopcion") /*almaceno informacion del service*/
//    public String index(Model model) {
//        List<FormAdoptar> listaformadoptar = iformadoptarService.getAllFormAdoptar();
//        model.addAttribute("titulo", "Tabla de Adopciones");
//        /*Donde se envia info de bank a frone*/
//        model.addAttribute("AplicarAdopcion", listaformadoptar);
//        return "AplicarAdopcion";
//
//    }
//    
//
//    /*Metodo para crear*/
//    @GetMapping("AplicarAdopcionN")
//    public String crearFormularioAdopcion(Model model) {
//        List<FormAdoptar> listaFormadoptar = iformadoptarService.listform();
//        model.addAttribute("aplicar", new FormAdoptar());
//        model.addAttribute("forma", listaFormadoptar);
//        return "FormularioAdopcion";
//
//    }
//
//    @GetMapping("/delete/{id}")
//    public String eliminarFormAdoptar(@PathVariable("id") Long idFormAdoptar) {
//        iformadoptarService.delete(idFormAdoptar);
//        return "redirect:/AplicarAdopcion";
//
//    }
//
//    /*Metodo para guardar , Post lo utlizamos para almacenar INFO*/
//    @PostMapping("/save")
//    public String guardarFormAdoptar(@ModelAttribute FormAdoptar formadoptar) {
//        iformadoptarService.saveFormAdoptar(formadoptar);
//        return "redirect: /FormularioAdoptar";
//    }
//
//    @GetMapping("/editAplicarAdopcion/{id}")
//    public String editarAplicarAdopcion(@PathVariable("id") Long idFormAdoptar, Model model) {
//        FormAdoptar formadoptar = iformadoptarService.getFormAdoptarById(idFormAdoptar);
//        List<FormAdoptar> listaFormAdoptar = iformadoptarService.listform();
//        model.addAttribute("forma", formadoptar);
//        model.addAttribute("forma", listaFormAdoptar);
//        return "AplicarAdopcion";
//
//    }
//}
