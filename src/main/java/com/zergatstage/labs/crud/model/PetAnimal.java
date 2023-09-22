package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public abstract class PetAnimal extends Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer animal_id;

}
