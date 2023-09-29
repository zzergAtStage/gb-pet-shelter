package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.List;
//TODO documentation!
@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Horse extends PackAnimal{
    @Column(name = "horse_power")
    private double horsePower;

    /**
     * @return
     */
    @Override
    public List<Commands> getCommand() {
        return null;
    }

    /**
     * @param commands
     */
    @Override
    public void setCommand(List<Commands> commands) {

    }

    /**
     * @return
     */
    @Override
    public Integer getAnimalId() {
        return null;
    }

    /**
     * @param animalId
     */
    @Override
    public void setAnimalId(Integer animalId) {

    }

    /**
     * @return
     */
    @Override
    public String getAnimalName() {
        return null;
    }

    /**
     * @param animalName
     */
    @Override
    public void setAnimalName(String animalName) {

    }

    /**
     * @return
     */
    @Override
    public Date getDateOfBirth() {
        return null;
    }

    /**
     * @param dateOfBirth
     */
    @Override
    public void setDateOfBirth(Date dateOfBirth) {

    }
}
