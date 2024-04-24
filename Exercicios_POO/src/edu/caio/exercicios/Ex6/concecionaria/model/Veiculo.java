package edu.caio.exercicios.Ex6.concecionaria.model;

public abstract class Veiculo implements Taxa{
	protected String nome;
	protected double valor;
	protected String placa;
	
	public Veiculo(String nome, double valor, String placa) {
		this.nome = nome;
		this.valor = valor;
		this.placa = placa;
	}
	
	public String getNome() {
		return nome;
	}


	public double getValor() {
		return valor;
	}


	public String getPlaca() {
		return placa;
	}

	


	
	
	
}
