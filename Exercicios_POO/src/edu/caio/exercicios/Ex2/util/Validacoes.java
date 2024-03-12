package edu.caio.exercicios.Ex2.util;

public class Validacoes {
	

	public boolean validaSaldo(double valorAretirar, double saldoDoCliente) {
		
		if(valorAretirar > saldoDoCliente) {
			return false;
		}
		else {
			return true;
		}
	}
}
