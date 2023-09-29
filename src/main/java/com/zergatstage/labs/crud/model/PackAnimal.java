package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PackAnimal implements Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    protected Integer animalId;
    @Column(name = "animal_name")
    private String animalName;
    @Column(name = "maximum_capacity")
    private Double maximumCapacity;

}
