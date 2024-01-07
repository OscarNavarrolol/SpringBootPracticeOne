package com.adso.firstweb.service.impl;

import com.adso.firstweb.entities.Persona;
import com.adso.firstweb.repository.PersonaRepository;
import com.adso.firstweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*@Service:

Anotación de Spring que marca esta clase como un componente de servicio.
@Autowired private PersonaRepository personaRepo;:

Inyección de dependencia del repositorio PersonaRepository para permitir el acceso a las operaciones de base de datos relacionadas con la entidad Persona.
Método obtenerToda():

Utiliza el método findAll() del repositorio para obtener una lista de todas las personas.
Método obtenerById(Long idUser):

Utiliza el método findById(idUser) del repositorio para obtener una persona por su idUser.
Método crearPersona(Persona persona):

Utiliza el método save(persona) del repositorio para guardar una nueva persona en la base de datos.
Método actualizarPerson(Long idUser, Persona persona):

Busca una persona por idUser, actualiza sus datos con los de la nueva persona recibida y guarda los cambios en la base de datos.
Método eliminarPerson(Long idUser):

Utiliza el método deleteById(idUser) del repositorio para eliminar una persona por su idUser.
Método contarPerson():

Utiliza el método count() del repositorio para contar el número total de personas en la base de datos. */


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
