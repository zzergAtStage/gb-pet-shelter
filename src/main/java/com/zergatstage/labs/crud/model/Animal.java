package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


public interface Animal {

    /**
     * Gathers list of commands
     * @return List of commands or emptyList
     */
    public List<Commands> getCommand();

    /**
     * Stores list of commands to every animal in DB
     * @param commands List of commands (by default emptyList)
     */
    public void setCommand(List<Commands> commands);

    //getter & setters
    public Integer getAnimalId();

    public void setAnimalId(Integer animalId);

    public String getAnimalName();

    public void setAnimalName(String animalName);

    public Date getDateOfBirth();

    public void setDateOfBirth(Date dateOfBirth);
}
