package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public class Hamster extends PetAnimal{
    @Column(name = "hunger_ratio")
    private int hungarRatio;
}