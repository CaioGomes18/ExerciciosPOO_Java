package edu.caio.exercicios.Ex6.concecionaria.test;

import edu.caio.exercicios.Ex6.concecionaria.model.Carro;
import edu.caio.exercicios.Ex6.concecionaria.model.Motocicleta;
import edu.caio.exercicios.Ex6.concecionaria.service.RelatorioImposto;

public class ConcecionariaTest {
	
	public static void main(String[] args) {
		Carro carro = new Carro("Sandero", 25000, "QBU6789");
		Motocicleta moto = new Motocicleta("Harley dayvisson" ,51000, "CJD6352");
		
		RelatorioImposto.relatorioMpostoVeiculo(carro);
		System.out.println("------------------------");
		RelatorioImposto.relatorioMpostoVeiculo(moto);
	}
}
