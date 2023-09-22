package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
   @Id
    protected Integer animal_id;

   @Column(name = "animal_name")
    private String animalName;

   @Column(name = "date_of_birth")
    private Date dateOfBirth;

    public Integer getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(Integer animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
