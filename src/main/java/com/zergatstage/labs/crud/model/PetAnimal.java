package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public abstract class PetAnimal extends Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    protected Integer animalId;

}
