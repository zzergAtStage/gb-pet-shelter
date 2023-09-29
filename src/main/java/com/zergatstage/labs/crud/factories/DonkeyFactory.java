package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Donkey;

public class DonkeyFactory implements AnimalFactory{
    /**
     * @return new Donkey instance
     */
    @Override
    public Animal createAnimal() {
        return new Donkey();
    }
}
