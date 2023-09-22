package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public class Cat extends PetAnimal{
    @Column(name = "taiil_width")
    private double tailWidth;
}
