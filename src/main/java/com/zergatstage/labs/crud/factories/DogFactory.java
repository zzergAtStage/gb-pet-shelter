package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Dog;

public class DogFactory implements AnimalFactory{
    /**
     * @return New instance of Dog class
     */
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
