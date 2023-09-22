package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public abstract class PackAnimal extends Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer animalId;

    @Column(name = "maximum_capacity")
    private Double maximumCapacity;

}
