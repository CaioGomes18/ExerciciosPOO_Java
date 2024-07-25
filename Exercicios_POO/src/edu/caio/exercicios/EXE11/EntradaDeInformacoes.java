package edu.caio.exercicios.EXE11;


import java.util.Scanner;
public class EntradaDeInformacoes {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá seja bem vindo ao meu programa.");
		System.out.println("Por favor insira um valor para a String s : ");
		String s = input.next();
		System.out.println("Por insira um valor para a String m : ");
		String m = input.next();
		
		boolean resultado = Solution.ValidAnagram(s, m);
		
		System.out.println(resultado);
	}
}
