package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

public interface StudentService {
	
	void create(Student s);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public void updateEmail(Student s);
	
	public void delete(int id);

}
