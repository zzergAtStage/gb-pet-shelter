package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public abstract class PackAnimal extends Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer animal_id;

    @Column(name = "maximum_capacity")
    private Double maximumCapacity;

}
