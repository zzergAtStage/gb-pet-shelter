package com.zergatstage.labs.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Donkey extends PackAnimal{
    @Column(name = "bray_loudness")
    private double brayLoudness;

}
