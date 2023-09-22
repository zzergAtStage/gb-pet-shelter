package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public class Dog extends PetAnimal{
    @Column(name = "bark_loudness")
    private double barkLoudness;
    protected String makeSound(){
        return "Bark!";
    }
}
