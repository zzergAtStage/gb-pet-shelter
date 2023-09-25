package com.zergatstage.labs.crud.service;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Commands;

import java.util.List;

public interface CommandService {
    void createOrUpdateCommand(Commands command);

    List<Animal> getAllCommand();

    void deleteCommand(Long id);

    Animal editCommand(Long id);
}
