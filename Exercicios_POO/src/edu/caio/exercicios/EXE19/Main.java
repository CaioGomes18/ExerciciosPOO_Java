package edu.caio.exercicios.EXE19;

public class Main {
	public static void main(String [] args) {
		Funcionario func = new Funcionario("Josefina", "Faxineira", 1509);
		Funcionario func2 = new Funcionario("João"," Programador", 5000);
		
		System.out.println("Printando detalhes dos funcionarios");
		System.out.println(func);
		System.out.println(func2);
		
		System.out.println("Vamos aumentar o salario dos dois funcionarios");
		
		func.aumentaSalario(10);
		func2.aumentaSalario(50);
		
		System.out.println("Printando os valores dos funcionarios após o aumento");
		System.out.println(func);
		System.out.println(func2);
		
	}
}
