package edu.caio.exercicios.EXE24;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("Carolus Vitali", 11);
		Student student2 = new Student("Nakeisha Uhuru", 10);
		Student student3 = new Student("Gabriella Cherice", 10);
		
		System.out.println("Detalhes dos estudantes");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		student1.addCourse("Math");
		student1.addCourse("History");
		student1.addCourse("Science");
		
		student2.addCourse("Math");
		student2.addCourse("Biology");
		student2.addCourse("física");
		
		student3.addCourse("English");
		student3.addCourse("Micorbiology");
		student3.addCourse("geografy");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}
}
