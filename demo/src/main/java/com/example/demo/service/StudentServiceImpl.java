package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	public void create(Student s) {
		repository.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> student = repository.findById(id);
		return student.isPresent() ? student.get() : null;
	}

	@Override
	public void updateEmail(Student s) {
		Student student = getStudentById(s.getId());
		if (null != student) {
			student.setEmail(s.getEmail());

		}
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

}
