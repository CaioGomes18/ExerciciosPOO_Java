package edu.caio.exercicios.EXE15;

public class Executavel {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Zak", "Husky");
		Dog dog2 = new Dog("Thunder", "Labrador");
		
		System.out.println("Valores antes da atualização dos valores");
		
		System.out.println(dog1);
		System.out.println(dog2);
		
		dog2.setName("Arthur");
		dog1.setName("Moises");
		
		System.out.println("Valores após atualizações");
		
		System.out.println(dog1);
		System.out.println(dog2);
		
	}
}
