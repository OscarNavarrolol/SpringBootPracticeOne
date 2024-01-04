package com.adso.firstweb.repository;

import com.adso.firstweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

}

