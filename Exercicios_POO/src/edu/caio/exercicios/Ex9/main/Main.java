package edu.caio.exercicios.Ex9.main;


import java.util.Scanner;
import edu.caio.exercicios.Ex9.Programador;
public class Main {
	public static void main(String [] args ) {
		Scanner input =  new Scanner(System.in);
		
		Programador p = new Programador();
		
		
		System.out.println(" Olá bem vindo programador, insira suas informações : ");
		
		System.out.println("digite o seu nome, por favor : ");
		p.setNome(input.nextLine());
		
		System.out.println("Digite sua idaded por favor ");
		p.setIdade(input.next());
		
		
		System.out.println("Digite seu cpf por favor");
		p.setCPF(input.next());
		
		System.out.println("Digite seu salario por favor");
		p.setSalario(input.nextDouble());
		
		System.out.println("Ficha do Porgramador");
		System.out.println("Nome = " + p.getNome()+ "\nIdade = " + p.getIdade() + "\nCPF = " + p.getCPF() + "\nSalário = " + p.getSalario());
	}
}
