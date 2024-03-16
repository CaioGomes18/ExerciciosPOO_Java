package edu.caio.exercicios.Ex3.model;


import java.util.Scanner;

import edu.caio.exercicios.Ex3.dominio.Circulo;

public class Test {
	
	static private Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
		Circulo circulo =new Circulo();
		System.out.println("Digite o tamanho do raio do circulo : ");
		circulo.setRaio(input.nextDouble());
		
		circulo.fazerCalculos();
		
	}
}
