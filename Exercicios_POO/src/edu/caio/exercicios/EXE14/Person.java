package edu.caio.exercicios.EXE14;

public class Person {
	protected String name;
	protected double age;
	
	
	public Person(String name, double age) {

		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public double getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
