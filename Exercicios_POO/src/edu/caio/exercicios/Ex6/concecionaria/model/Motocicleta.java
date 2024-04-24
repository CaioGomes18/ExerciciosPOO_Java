package edu.caio.exercicios.Ex6.concecionaria.model;

public class Motocicleta extends Veiculo{
	
	public static final double VALOR_DA_TAXA = 0.035;
	
	public Motocicleta(String nome, double valor, String placa) {
		super(nome, valor, placa);

	}
	
	@Override
	public double calcularImposto() {
		return this.valor * VALOR_DA_TAXA;
	}
	
	
}
