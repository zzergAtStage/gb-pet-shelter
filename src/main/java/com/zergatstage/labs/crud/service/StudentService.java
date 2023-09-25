package com.zergatstage.labs.crud.service;


import com.zergatstage.labs.crud.dto.StudentDTO;
import java.util.List;

public interface StudentService {

	public void createOrUpdateStudent(StudentDTO empDTO);
	
	public List<StudentDTO> getAllStudent();
	
	public void deleteStudent(Long id);
	
	public StudentDTO editStudent(Long id);

	public List<StudentDTO> getStudentsById(Long id);
}
