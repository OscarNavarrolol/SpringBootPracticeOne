package com.adso.firstweb.service;

import com.adso.firstweb.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerToda();

    Persona obtenerById(Long idUser);

    Persona crearPersona(Persona persona);

    Persona actualizarPerson(Long idUser, Persona persona);

    void eliminarPerson(Long idUser);

    Long contarPerson();
}
