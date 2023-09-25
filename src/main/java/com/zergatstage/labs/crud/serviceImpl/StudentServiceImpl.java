package com.zergatstage.labs.crud.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.zergatstage.labs.crud.dto.StudentDTO;
import com.zergatstage.labs.crud.model.Student;
import com.zergatstage.labs.crud.repository.StudentRepository;
import com.zergatstage.labs.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public void createOrUpdateStudent(StudentDTO studentDTO) {
		Student student = convertDtoToModel(studentDTO);
		studentRepository.save(student);
	}
	
	public List<StudentDTO> getAllStudent() {
		List<Student> list = studentRepository.findAll();
		List<StudentDTO> userList = list.stream()
	            .map(StudentDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return userList;
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
	public StudentDTO editStudent(Long id) {
		Student student = studentRepository.getReferenceById(id);
		return convertModelToDTO(student);
	}

	private Student convertDtoToModel(StudentDTO userDto) {
		Student student = new Student();
		if (userDto.getId() != null) {
			student.setId(userDto.getId());
		}
		student.setEmailId(userDto.getEmailId());
		student.setFirstName(userDto.getFirstName());
		student.setLastName(userDto.getLastName());
		return student;
	}
	
	private StudentDTO convertModelToDTO(Student student) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(student.getId());
		studentDTO.setEmailId(student.getEmailId());
		studentDTO.setFirstName(student.getFirstName());
		studentDTO.setLastName(student.getLastName());
		return studentDTO;
	}

	public List<StudentDTO> getStudentsById(Long id) {
		// Assuming studentRepository has a method to find a student by id
		Optional<Student> studentOptional = studentRepository.findById(id);

		if (studentOptional.isPresent()) {
			// If a student with the given id exists, return it as a single-element list
			Student student = studentOptional.get();
			StudentDTO studentDTO = new StudentDTO(student);
			return Collections.singletonList(studentDTO);
		} else {
			// If no student with the given id is found, return an empty list
			return Collections.emptyList();
		}
	}
}
