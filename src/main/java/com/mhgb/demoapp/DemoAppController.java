package com.mhgb.demoapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {

	public List<Student> generateStudentList() {

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", 5));
		students.add(new Student(2, "Willam", 5));
		students.add(new Student(3, "Ray", 5));
		students.add(new Student(4, "Jesica", 5));

		return students;
	}

	@GetMapping("/")
	public List<Student> getAll() {
		return generateStudentList();
	}
}
