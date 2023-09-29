package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Hamster;

public class HamsterFactory implements AnimalFactory{
    /**
     * @return new Hamster instance
     */
    @Override
    public Animal createAnimal() {
        return new Hamster();
    }
}
