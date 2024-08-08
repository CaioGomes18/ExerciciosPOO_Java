package edu.caio.exercicios.EXE22;

import java.time.LocalDate;

public class Main {
	public static void main(String [] args) {
		Employee empregado = new Employee("Caio", 3000,  LocalDate.parse("2021-04-01"));
		
		Employee empregado2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
	    

	    Employee empregado3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
	    
	    empregado.dadosEmpregado();
	    
	    System.out.println("Anos de Serviço do empregado 1 : " + empregado.anosDeServico());
	    
	    empregado2.dadosEmpregado();
	    
	    System.out.println("Anos de Serviço do empregado 2 : " + empregado2.anosDeServico());
	    
	    empregado3.dadosEmpregado();
	    
	    System.out.println("Anos de Serviço do empregado 3 : " + empregado3.anosDeServico());
	}
}
