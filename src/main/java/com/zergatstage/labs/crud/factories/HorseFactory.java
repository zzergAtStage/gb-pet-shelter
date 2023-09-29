package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Horse;

public class HorseFactory implements AnimalFactory{
    /**
     * @return new Horse class instance
     */
    @Override
    public Animal createAnimal() {
        return new Horse();
    }
}
