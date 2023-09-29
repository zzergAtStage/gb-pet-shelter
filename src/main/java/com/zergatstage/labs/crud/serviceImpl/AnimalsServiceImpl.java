package com.zergatstage.labs.crud.serviceImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;
import com.zergatstage.labs.crud.dto.AnimalDTO;
import com.zergatstage.labs.crud.model.*;
import com.zergatstage.labs.crud.repository.AnimalRepository;
import com.zergatstage.labs.crud.repository.DogRepository;
import com.zergatstage.labs.crud.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalsServiceImpl implements AnimalsService {
	
	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private DogRepository dogRepository;
	public void createOrUpdateAnimal(AnimalDTO animalDTO) {
		Animal animal = convertDtoToModel(animalDTO);
		animalRepository.save(animal);
	}
	
	public List<AnimalDTO> getAllAnimal() {
		List<Animal> list = animalRepository.findAll();
		List<AnimalDTO> userList = list.stream()
	            .map(AnimalDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return userList;
	}
	
	public void deleteAnimal(Long id) {
		animalRepository.deleteById(id);
	}
	
	public AnimalDTO editAnimal(Long id) {
		Animal animal = animalRepository.getReferenceById(id);
		return convertModelToDTO(animal);
	}

	/**
	 * Method convert the DTO object to the model to store in DB
	 * @param animalDto from web framework data
	 * @return an Animal instance
	 */
	private Animal convertDtoToModel(AnimalDTO animalDto) {
		Animal animal;
        String animalClassName = animalDto.getAnimalClass();
		try{
			Class<?> animalClass = Class.forName(animalClassName);
			animal = (Animal) animalClass.getDeclaredConstructor().newInstance();
			animal.setAnimalName(animalDto.getAnimalName());
			animal.setCommand(animalDto.getCommands());
			animal.setDateOfBirth(animalDto.getDateOfBirth());
			return animal;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		return null;
	}
	
	private AnimalDTO convertModelToDTO(Animal animal) {
		AnimalDTO animalDTO = new AnimalDTO();
		//TODO: implementation
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

	public void saveDog(Dog dog) {
		dogRepository.save(dog);
	}
}
