package com.adso.firstweb.controller;


import com.adso.firstweb.entities.Persona;
import com.adso.firstweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/personas")
@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    //  el objeto Model se utiliza para pasar datos desde el controlador a la vista
    @GetMapping
    public String listarPersona (Model model){
        List<Persona> personas = personaService.obtenerToda();
        model.addAttribute("listpersonas",personas);
        return "listar";
    }

    @GetMapping("/new")
    public String mostrarFormNewPerson(Model model){
        model.addAttribute("newPersona",new Persona());
        model.addAttribute("accion","");
        return "form";
    }

    /*@ModelAttribute se usa para enlazar datos de la solicitud a un objeto Java
    o para devolver atributos del modelo en métodos controladores,
    facilitando la transferencia de datos entre el controlador y la vista en Spring MVC.*/

    @PostMapping("/new")
    public String guardaNuevaPerson(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{idUser}")
    public String mostrarFormEditPerson(@PathVariable Long idUser,@ModelAttribute Persona persona, Model model){
        model.addAttribute("newPersona",persona);
        model.addAttribute("accion","/personas/editar/"+idUser);
        return "form";
    }

    @PostMapping("/editar/{idUser}")
    public String actualizarPerson(@PathVariable Long idUser, @ModelAttribute Persona persona){
        personaService.actualizarPerson(idUser,persona);
        return "redirect:/personas";
    }

    @GetMapping("/eliminar/{idUser}")
    public String eliminarPerson(@PathVariable Long idUser){
        personaService.eliminarPerson(idUser);
        return "redirect:/personas";
    }


}
