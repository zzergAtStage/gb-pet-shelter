package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animalId")
public class Camel extends PackAnimal{
    @Column(name = "hump_value")
    private int humpValue;
}
