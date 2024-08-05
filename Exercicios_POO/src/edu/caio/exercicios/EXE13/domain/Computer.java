package edu.caio.exercicios.EXE13.domain;

public class Computer extends Product {

	
	public static final double IMPOSTO_POR_CENTO = 0.21;
	
	public Computer(String nome, double valor) {
		super(nome, valor);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateTaxes() {
		System.out.println("Calculando imposto do cmputador");
		return this.valor * IMPOSTO_POR_CENTO;
	}
	
}
