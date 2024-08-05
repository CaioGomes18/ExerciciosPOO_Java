package edu.caio.exercicios.EXE13.domain;

public class CellPhone extends Product{
	
	public CellPhone(String nome, double valor) {
		super(nome, valor);
		// TODO Auto-generated constructor stub
	}

	public static final double IMPOSTO_POR_CENTO = 0.5;

	@Override
	public double calculateTaxes() {
		// TODO Auto-generated method stub
		System.out.println("Calculando imposto do telefone");
		return this.valor * IMPOSTO_POR_CENTO;
	}
}
