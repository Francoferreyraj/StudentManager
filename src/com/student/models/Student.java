package com.student.models;

public class Student {

	private String id;
	private String name;
	private String email;
	private double grade;
	
	public Student() {
		
	}

	public Student(String id, String name, String email, double grade) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj != null && this.getClass() == obj.getClass()) {
			if (this == obj) {
				return true;
			} else {
				Student student = (Student) obj;
				return id.equals(student.id);
			}
		} else {
			return false;
		}
		
	}
	
	
	/*
	 * String nombre1 = "Pepe";
	 * String nombre2 = "Pepe";
	 * 
	 * nombre1.equals(nombre2);
	 * 
	 * Student student1 = new Student();
	 * Student student2 = new Student();
	 * 
	 * student1.equals(student2);
	 * 
	 */
	
	
}
