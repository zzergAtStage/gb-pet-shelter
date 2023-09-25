package com.zergatstage.labs.crud.service;


import com.zergatstage.labs.crud.dto.AnimalDTO;
import com.zergatstage.labs.crud.dto.AnimalDTO;
import java.util.List;

public interface AnimalsService {

	public void createOrUpdateAnimal(AnimalDTO animalDTO);
	
	public List<AnimalDTO> getAllAnimal();
	
	public void deleteAnimal(Long id);
	
	public AnimalDTO editAnimal(Long id);

	public List<AnimalDTO> getAnimalsById(Long id);
}
