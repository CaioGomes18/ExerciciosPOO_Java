package edu.caio.exercicios.Ex6.concecionaria.service;

import edu.caio.exercicios.Ex6.concecionaria.model.Veiculo;

public class RelatorioImposto {
	
	public static void relatorioMpostoVeiculo(Veiculo veiculo) {
		System.out.println("Realizando relatório de imposto");
		double imposto = veiculo.calcularImposto();
		System.out.println("Nome = "+ veiculo.getNome());
		System.out.println("valor = " + veiculo.getValor());
		System.out.println("Valor do imposto = " + imposto);
	}
}
