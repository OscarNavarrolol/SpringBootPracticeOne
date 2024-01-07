package com.adso.firstweb;

import com.adso.firstweb.entities.Persona;
import com.adso.firstweb.repository.PersonaRepository;
import com.adso.firstweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FirstWebSpringbootApplication{

    @Autowired
    private PersonaService personaService;

    public static void main(String[] args) {
        SpringApplication.run(FirstWebSpringbootApplication.class, args);
    }

   /*
    @Override
    public void run(String... args) throws Exception {
        //coment
        personaService.crearPersona(new Persona(11L,"Ernio Hits",12));
        personaService.crearPersona(new Persona(12L,"Camn loker",32));
        personaService.crearPersona(new Persona(13L,"Urll Hangyek",111));
        personaService.crearPersona(new Persona(14L,"Minda Kariak",33));

        System.out.println("Personas Guardadas correctamente: " + personaService.contarPerson());

        List<Persona> personas = personaService.obtenerToda();
        personas.forEach(p -> System.out.println("Nombre Persona : "+ p.getNameUser()));
    }
    */

}
