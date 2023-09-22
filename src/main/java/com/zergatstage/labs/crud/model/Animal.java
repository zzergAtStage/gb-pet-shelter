package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
   @Id
    protected Integer animalId;

   @Column(name = "animal_name")
    private String animalName;

   @Column(name = "date_of_birth")
    private Date dateOfBirth;

   @ElementCollection
   private List<Commands> commands;
    public List<Commands> getCommand() {
        return commands;
    }

    public void setCommand(List<Commands> commands) {
        this.commands = commands;
    }

    //getter & setters
    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
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
