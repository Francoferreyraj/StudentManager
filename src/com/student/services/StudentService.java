package com.student.services;

import java.util.ArrayList;
import java.util.HashMap;

import com.student.models.Student;

public class StudentService {

	private HashMap<String, Student> students = new HashMap<>();
	
	public ArrayList<Student> getAllStudents() {
		return new ArrayList<Student>(students.values());
	}

	public Student findStudentById(String id) {
		return students.get(id);
	}
	
	public void addStudent(Student student) {
		if (student == null || student.getId() == null 
				|| student.getId().isEmpty()) {
			throw new IllegalArgumentException("Estudiante inválido.");
		}
		if (students.containsKey(student.getId())) {
			throw new IllegalArgumentException("Ya existe un estudiante con "
					+ " ID: " + student.getId());
		}
		students.put(student.getId(), student);
		System.out.println("Estudiante agregado: " + student.toString());
	}
	
	public boolean updateStudent(String id, Student student) {
		
		return false;
	}
	
	public boolean deleteStudent(String id) {
		
		return false;
	}
	
	public int getStudentCount() {
		
		return 0;
	}
		
	public boolean updateStudentGrade(String id, double grade) {
		
		return false;
	}
	
	public double getAverageGrade() {
		return 0.0;
	}
	
}
