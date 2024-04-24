package edu.caio.exercicios.Ex6.concecionaria.model;

public class Carro extends Veiculo{

	public static final double VALOR_DA_TAXA = 0.02;
	
	public Carro(String nome, double valor, String placa) {
		super(nome, valor, placa);
	}

	public double calcularImposto() {
		return this.valor * VALOR_DA_TAXA;
		
	}

	
}
