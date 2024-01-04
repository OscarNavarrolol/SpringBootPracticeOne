package com.adso.firstweb.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seres")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona {
    @Id
    private long idUser;
    private String nameUser;
    private int age;

}
