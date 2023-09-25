package com.zergatstage.labs.crud.service;


import com.zergatstage.labs.crud.dto.AnimalDTO;
import com.zergatstage.labs.crud.dto.AnimalDTO;
import java.util.List;

public interface AnimalsService {

	void createOrUpdateAnimal(AnimalDTO animalDTO);
	
	List<AnimalDTO> getAllAnimal();
	
	void deleteAnimal(Long id);
	
	AnimalDTO editAnimal(Long id);

	List<AnimalDTO> getAnimalsById(Long id);
}
