package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public class Horse extends PackAnimal{
    @Column(name = "horse_power")
    private double horsePower;

}
