package edu.caio.exercicios.EXE24;

import java.util.ArrayList;


import java.util.*;
public class Student {
	private String name;
	private int grade;
	private ArrayList<String> course;
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
		this.course = new ArrayList<>();
		
		
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public ArrayList<String> getCourse() {
		return course;
	}
	@Override
	public String toString() {
		
		String strRetorno = "nome = " + this.getName() + " grade = " + this.getGrade();
		
		strRetorno += this.getCourse();
		return strRetorno;
	}
	
	public ArrayList<String> courses() {
		return course;
	}
	
	public void addCourse(String course) {
		this.course.add(course);
	}
	
	public void removeCourse(String c) {
		this.course.remove(c);
	}
	
}
