package edu.caio.exercicios.Ex2.model;

public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	private boolean statusEspecial;
	private double limite;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatusEspecial() {
		return statusEspecial;
	}
	public void setStatusEspecial(boolean statusEspecial) {
		this.statusEspecial = statusEspecial;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
