package com.openclassroom.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
Fais le lien entre l'application et la base de données.
 */


@Data // Permet de générer getter/setter automatiquement
@Entity // Precise que cela est une table en BDD
@Table(name = "employees") //Indique le nom de la table associé
public class Employee {

    @Id //Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto_Increment
    private Long id;

    @Column(name="first_name") //Fais le lien avec les noms de colonnes de la table car nom pas identique
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;

}