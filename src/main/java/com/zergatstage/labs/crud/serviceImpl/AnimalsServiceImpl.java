package com.zergatstage.labs.crud.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.zergatstage.labs.crud.dto.AnimalDTO;
import com.zergatstage.labs.crud.model.*;
import com.zergatstage.labs.crud.repository.AnimalRepository;
import com.zergatstage.labs.crud.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalsServiceImpl implements AnimalsService {
	
	@Autowired
	private AnimalRepository animalRepository;

	public void createOrUpdateAnimal(AnimalDTO animalDTO) {
		Animal animal = convertDtoToModel(animalDTO);
		animalRepository.save(animal);
	}
	
	public List<AnimalDTO> getAllAnimal() {
		List<Animal> list = animalRepository.findAll();
        return list.stream()
	            .map(AnimalDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
	}
	
	public void deleteAnimal(Long id) {
		animalRepository.deleteById(id);
	}
	
	public AnimalDTO editAnimal(Long id) {
		Animal animal = animalRepository.getReferenceById(id);
		return convertModelToDTO(animal);
	}

	private Animal convertDtoToModel(AnimalDTO animalDto) {

        if (animalDto.getAnimalClass().equals("Dog")) {
			Animal animal = new Dog();
		} else if (animalDto.getAnimalClass().equals("Cat")) {
			Animal animal = new Cat();
		} else if (animalDto.getAnimalClass().equals("Hamster")) {
			Animal animal = new Hamster();
		} else if (animalDto.getAnimalClass().equals("Horse")) {
			Animal animal = new Horse();
		} else if (animalDto.getAnimalClass().equals("Camel")) {
			Animal animal = new Camel();
		} else if (animalDto.getAnimalClass().equals("Donkey")) {
			Animal animal = new Donkey();
		} else {
            throw new IllegalStateException("Unexpected value: " + animalDto.getAnimalClass());
        }

		//TODO change the constructor to factory
		Animal animal = new Dog();
//		if (animalDto.() != null) {
//			animal.setId(animalDto.getId());
//		}
//		animal.setEmailId(animalDto.getEmailId());
//		animal.setFirstName(animalDto.getFirstName());
//		animal.setLastName(animalDto.getLastName());
		return animal;
	}
	
	private AnimalDTO convertModelToDTO(Animal animal) {
		AnimalDTO animalDTO = new AnimalDTO();
		//TODO implementation
//		animalDTO.setId(animal.getId());
//		animalDTO.setEmailId(animal.getEmailId());
//		animalDTO.setFirstName(animal.getFirstName());
//		animalDTO.setLastName(animal.getLastName());
		return animalDTO;
	}

	public List<AnimalDTO> getAnimalsById(Long id) {
		// Assuming animalRepository has a method to find an animal by id
		Optional<Animal> animalOptional = animalRepository.findById(id);

		if (animalOptional.isPresent()) {
			// If an animal with the given id exists, return it as a single-element list
			Animal animal = animalOptional.get();
			AnimalDTO animalDTO = new AnimalDTO(animal);
			return Collections.singletonList(animalDTO);
		} else {
			// If no animal with the given id is found, return an empty list
			return Collections.emptyList();
		}
	}
}
