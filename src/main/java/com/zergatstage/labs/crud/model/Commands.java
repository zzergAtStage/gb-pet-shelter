package com.zergatstage.labs.crud.model;

import jakarta.persistence.*;

@Entity
public class Commands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "command_id")
    private int id;

    @Column(name = "command_name")
    private String commandName;

}
