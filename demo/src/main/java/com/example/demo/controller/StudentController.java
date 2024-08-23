package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/student/")
	public void createStudent(@RequestBody Student student) {
		studentService.create(student);
	}
	
	  @GetMapping("/students/") 
	  public List<Student> getAllStudent(){ 
		  return studentService.getAllStudent(); 
	  }
	  
	  @GetMapping("/student/{id}") 
	  public Student getStudentById(@PathVariable int id) {
		  return studentService.getStudentById(id);
	  }
	 
	  @PatchMapping("/student/")
	  public void updateEmail(@RequestBody Student student) {
		  studentService.updateEmail(student);
	  }
	  
	  @DeleteMapping("/student/{id}")
	  public void deleteStudent(@PathVariable int id) {
		  studentService.delete(id);
	  }
}
