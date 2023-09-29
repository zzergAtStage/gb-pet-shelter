package com.zergatstage.labs.crud.factories;

import com.zergatstage.labs.crud.model.Animal;
import com.zergatstage.labs.crud.model.Cat;

public class CatFactory implements AnimalFactory{
    /**
     * @return new instance of Cat class
     */
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
