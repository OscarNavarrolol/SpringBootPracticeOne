package com.adso.firstweb.controller;


import com.adso.firstweb.entities.Persona;
import com.adso.firstweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*listarPersona: Maneja la solicitud GET en /personas para mostrar una lista de personas.
Obtiene todas las personas del servicio PersonaService y las agrega al modelo con el nombre listpersonas, luego devuelve la vista listar.

mostrarFormNewPerson: Maneja la solicitud GET en /personas/new para mostrar un formulario vacío para agregar una nueva persona.
Crea una nueva instancia de Persona, la agrega al modelo como newPersona y establece el atributo accion en una cadena vacía. Devuelve la vista form.

guardaNuevaPerson: Maneja la solicitud POST en /personas para guardar una nueva persona.
Recibe los datos del formulario a través del objeto Persona,
los pasa al servicio PersonaService para crear una nueva persona y luego redirige al usuario de vuelta a la lista de personas (redirect:/personas). */

@RequestMapping("/personas")
@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // tranferir del controller a la vista
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

    @PostMapping("/new")
    public String guardaNuevaPerson(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

}
