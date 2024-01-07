package com.adso.firstweb.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Entity:

Anotación utilizada en JPA para indicar que esta clase es una entidad que se mapea a una tabla en la base de datos.
@Table(name = "seres"):

Especifica el nombre de la tabla en la base de datos a la que se mapea esta entidad (Persona).
@Data:

Anotación de Lombok que genera automáticamente los métodos getters, setters, toString, equals, y hashCode para todos los campos de la clase.
@AllArgsConstructor y @NoArgsConstructor:

Anotaciones de Lombok que generan constructores con y sin argumentos respectivamente. @AllArgsConstructor crea un constructor que inicializa todos los campos de la clase, mientras que @NoArgsConstructor crea un constructor sin argumentos.
@Id:

Indica que idUser es la clave primaria de esta entidad.
@GeneratedValue(strategy = GenerationType.IDENTITY):

Especifica que la generación de valores para la clave primaria se realizará mediante una estrategia de identidad (autoincremental en la mayoría de las bases de datos) cuando se inserten nuevas filas en la tabla seres.
Campos de la clase Persona:

idUser: Identificador único de la persona (clave primaria).
nameUser: Nombre de la persona.
age: Edad de la persona. */

@Entity
@Table(name = "seres")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    private String nameUser;
    private int age;

}
