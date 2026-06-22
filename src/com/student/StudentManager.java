package com.student;

import java.util.ArrayList;
import java.util.Scanner;

import com.student.models.Student;
import com.student.services.StudentService;

public class StudentManager {

	private static StudentService service = new StudentService();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		loadSampleData();
		
		System.out.println("Elija una opción: ");
		System.out.println("1. Listar alumnos. ");
		System.out.println("2. Buscar alumnos por id. ");
		System.out.print("\nElija una opción: ");
		
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
			case 1:
				listStudents();
				break;
			case 2:	
				findStudent();
				break;
			default:
		}

		scanner.close();
	}
	
	private static void loadSampleData() {
		service.addStudent(new Student("45502", "Juan Pérez", "jperez@mail.com", 5.60));
		service.addStudent(new Student("45503", "Ana García", "agarcia@mail.com", 8.50));
		service.addStudent(new Student("45504", "Paula Pérez", "pperez@mail.com", 7.20));
	}
	
	private static void listStudents() {
		ArrayList<Student> students = service.getAllStudents();
		System.out.println("\n\nLista de Estudiantes: ");
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	private static void findStudent() {
		System.out.print("\n\nEscriba el id del estudiante: ");
		String id = scanner.nextLine();
		Student student = service.findStudentById(id);
		System.out.println(student);
	}

}
