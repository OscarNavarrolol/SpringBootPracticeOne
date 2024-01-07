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

}
