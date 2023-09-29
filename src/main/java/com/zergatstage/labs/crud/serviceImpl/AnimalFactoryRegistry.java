package com.zergatstage.labs.crud.serviceImpl;

import com.zergatstage.labs.crud.factories.AnimalFactory;
import com.zergatstage.labs.crud.model.Animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactoryRegistry {
        private final Map<String, AnimalFactory> factories = new HashMap<>();

        public void registerFactory(String animalType, AnimalFactory factory) {
            factories.put(animalType, factory);
        }

        public Animal createAnimal(String animalType) {
            AnimalFactory factory = factories.get(animalType);
            if (factory != null) {
                return factory.createAnimal();
            } else {
                throw new IllegalArgumentException("Unknown animal type: " + animalType);
            }
        }
}
