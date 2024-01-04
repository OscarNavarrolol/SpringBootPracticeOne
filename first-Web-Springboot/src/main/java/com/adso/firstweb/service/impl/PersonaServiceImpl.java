package com.adso.firstweb.service.impl;

import com.adso.firstweb.entities.Persona;
import com.adso.firstweb.repository.PersonaRepository;
import com.adso.firstweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    @Override
    public List<Persona> obtenerToda() {
        return personaRepo.findAll();
    }

    @Override
    public Persona obtenerById(Long idUser) {
        return personaRepo.findById(idUser).orElse(null);

    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    @Override
    public Persona actualizarPerson(Long idUser, Persona persona) {
        Persona personBBDD = personaRepo.findById(idUser).orElse(null);

        if (personBBDD != null) {
            personBBDD.setNameUser(persona.getNameUser());
            personBBDD.setAge(persona.getAge());
            return personaRepo.save(personBBDD);
        }
        return null;
    }

    @Override
    public void eliminarPerson(Long idUser) {
        personaRepo.deleteById(idUser);
    }

    @Override
    public Long contarPerson() {
        return personaRepo.count();
    }
}
