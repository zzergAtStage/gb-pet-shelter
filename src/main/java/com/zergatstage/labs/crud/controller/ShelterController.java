package com.zergatstage.labs.crud.controller;

import com.zergatstage.labs.crud.dto.AnimalDTO;
import com.zergatstage.labs.crud.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;



@Controller
public class ShelterController {

	@Autowired
	private AnimalsService animalsService;

	@GetMapping(value = "/")
	public String listing(Model model){
		List<AnimalDTO> animalsList = animalsService.getAllAnimal();
		model.addAttribute("animalsList", animalsList);
		return "animal-list";
	}
	@GetMapping(value = {"/registration"})
	public String registration(Map<String, Object> model) {
		model.put("animal", new AnimalDTO());
		return "animal-add-update";
	}
	
	@PostMapping("/home")
	public String createAnimal
			(@ModelAttribute("animal") AnimalDTO animalDto) {
		animalsService.createOrUpdateAnimal(animalDto);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfAnimal(Model model) {
		List<AnimalDTO> animalList = animalsService.getAllAnimal();
		model.addAttribute("animalsList", animalList);
		return "animal-list";
	}
	
	@PostMapping("/delete")
	public String deleteAnimal(@RequestParam("id") String id) {
		animalsService.deleteAnimal(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editAnimal(
			@RequestParam("id") String id, Map<String, Object> model) {
		AnimalDTO animalDTO = animalsService
				.editAnimal(Long.parseLong(id));
		model.put("animal", animalDTO);
		return "animal-add-update";
	}

	@GetMapping("/commands")
	public String editCommands(
			@RequestParam("id") String id, Map<String, Object> model) {
			return "commands";
	}

	@GetMapping(value = "/search")
	public String search(@RequestParam("id") long id, Model model) {
		// Call a method in your service to perform the search
		List<AnimalDTO> searchResults = animalsService.getAnimalsById(id);

		// Add the search results to the model to display in the JSP
		model.addAttribute("animalsList", searchResults);

		return "animal-list"; // Create a new JSP page to display search results
	}
	
}
