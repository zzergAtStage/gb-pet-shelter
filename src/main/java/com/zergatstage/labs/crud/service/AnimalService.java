package com.zergatstage.labs.crud.service;

import com.zergatstage.labs.crud.dto.StudentDTO;
import com.zergatstage.labs.crud.model.Animal;

import java.util.List;

public interface AnimalService {

    public void createOrUpdateAnimal(Animal animal);

    public List<Animal> getAllAnimals();

    public void deleteAnimal(Long id);

    public Animal editAnimal(Long id);
}
