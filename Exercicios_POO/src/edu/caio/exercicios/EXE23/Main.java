package edu.caio.exercicios.EXE23;

import java.util.Scanner;
import java.util.*;


public class Main {
	public static void main(String [] args) {
		
		List<Livro> livros = new ArrayList<>();
		Biblioteca biblioteca = new Biblioteca();
		Scanner input = new Scanner(System.in);
		int option= 0;
		
		
		while(true) {
			System.out.println("\t0- Sair do loop");
			System.out.println("\t1- Adiconar novo livro");
			System.out.println("\t2- adiconar a biblioteca");
			System.out.println("\t3- Imprimir os livros na biblioteca");
			
			
			option = input.nextInt();
			if(option == 0) {
				break;
			}else if(option == 1) {
				
				input.nextLine();
				System.out.println("Qual é o nome do livro : ");
				String livroName = input.nextLine();
				
				System.out.println("qual o nome do autor do livro");
				String autorLivro = input.nextLine();
				
				System.out.println("qual o valor do livro");
				double precoLivro = input.nextDouble();	
				
				
				
				Livro livro = new Livro(livroName, autorLivro, precoLivro);
				
				livros.add(livro);
				
			}else if(option == 2) {
				biblioteca.add(livros);
				
			}else if(option == 3) {
				System.out.println(biblioteca);
			}
		}
		
	}

}
