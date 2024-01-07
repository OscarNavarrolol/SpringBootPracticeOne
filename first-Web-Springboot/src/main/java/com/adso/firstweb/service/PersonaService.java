package com.adso.firstweb.service;

import com.adso.firstweb.entities.Persona;

import java.util.List;

/* List<Persona> obtenerToda();:

Método para obtener una lista de todas las personas.
Persona obtenerById(Long idUser);:

Método para obtener una persona por su idUser.
Persona crearPersona(Persona persona);:

Método para crear una nueva persona.
Persona actualizarPerson(Long idUser, Persona persona);:

Método para actualizar los datos de una persona existente.
void eliminarPerson(Long idUser);:

Método para eliminar una persona por su idUser.
Long contarPerson();:

Método para contar el número total de personas. */


public interface PersonaService {
    List<Persona> obtenerToda();

    Persona obtenerById(Long idUser);

    Persona crearPersona(Persona persona);

    Persona actualizarPerson(Long idUser, Persona persona);

    void eliminarPerson(Long idUser);

    Long contarPerson();
}
