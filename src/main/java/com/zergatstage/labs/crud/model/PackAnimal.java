package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public abstract class PackAnimal extends Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    protected Integer animalId;

    @Column(name = "maximum_capacity")
    private Double maximumCapacity;

}
