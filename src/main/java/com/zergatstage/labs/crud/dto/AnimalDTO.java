package com.zergatstage.labs.crud.dto;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Commands;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;

import java.util.Date;
import java.util.List;

public class AnimalDTO {
    private String animalClass;
    private String animalName;
    private Date dateOfBirth;
    private List<Commands> commands;

    public AnimalDTO() {
    }

    public AnimalDTO(String animalClass, String animalName, Date dateOfBirth, List<Commands> commands) {
        this.animalClass = animalClass;
        this.animalName = animalName;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    public AnimalDTO(Animal animal) {
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

    public List<Commands> getCommands() {
        return commands;
    }

    public void setCommands(List<Commands> commands) {
        this.commands = commands;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }
}
