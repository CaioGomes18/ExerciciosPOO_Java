package edu.caio.exercicios.EXE15;

public class Dog {
	protected String name;
	protected String breed;
	
	
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	public Dog(String name, String breed) {
		
		this.name = name;
		this.breed = breed;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
}
