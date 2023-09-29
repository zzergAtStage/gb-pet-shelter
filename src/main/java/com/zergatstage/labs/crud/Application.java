package com.zergatstage.labs.crud;

import com.zergatstage.labs.crud.factories.DogFactory;
import com.zergatstage.labs.crud.serviceImpl.AnimalFactoryRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args);
	}

}
