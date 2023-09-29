package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Camel;

public class CamelFactory implements AnimalFactory{
    /**
     * @return a Camel class
     */
    @Override
    public Animal createAnimal() {
        return new Camel();
    }
}
