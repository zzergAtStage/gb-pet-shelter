package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Dog extends PetAnimal{
    @Column(name = "bark_loudness")
    private double barkLoudness;
    protected String makeSound(){
        return "Bark!";
    }

    /**
     * Gathers list of commands
     *
     * @return List of commands or emptyList
     */
    @Override
    public List<Commands> getCommand() {
        return null;
    }

    /**
     * Stores list of commands to every animal in DB
     *
     * @param commands List of commands (by default emptyList)
     */
    @Override
    public void setCommand(List<Commands> commands) {

    }

    @Override
    public Integer getAnimalId() {
        return null;
    }

    @Override
    public void setAnimalId(Integer animalId) {

    }

    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public void setAnimalName(String animalName) {

    }

    @Override
    public Date getDateOfBirth() {
        return null;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {

    }
}
