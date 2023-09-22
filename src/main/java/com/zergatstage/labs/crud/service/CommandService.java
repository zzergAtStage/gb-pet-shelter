package com.zergatstage.labs.crud.service;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Commands;

import java.util.List;

public interface CommandService {
    public void createOrUpdateCommand(Commands command);

    public List<Animal> getAllCommand();

    public void deleteCommand(Long id);

    public Animal editCommand(Long id);
}
