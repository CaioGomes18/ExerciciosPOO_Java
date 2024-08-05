package edu.caio.exercicios.EXE13.Service;

import edu.caio.exercicios.EXE13.domain.Product;

public class CalcularImposto {
	public static void calculandoImposto(Product produto) {
		System.out.println("Relatorio de calculo de imposto ");
		double imposto = produto.calculateTaxes();
		System.out.println("Imposto a ser pago " + imposto);
	}
}
