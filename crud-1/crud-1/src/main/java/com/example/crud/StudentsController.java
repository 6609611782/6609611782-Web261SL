package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Students")
public class StudentsController {
	
	@Autowired
	private StudentsRepository StudentsRepository;
	
	@GetMapping 
	public List<Students> getAllStudents() {
		return StudentsRepository.findAll();
	}
	
	@PostMapping("/add")
	public Students createStudents(@RequestBody Students Students) {
		return StudentsRepository.save(Students);
	}

}
