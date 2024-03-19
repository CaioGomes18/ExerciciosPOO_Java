package edu.caio.exercicios.Ex5.dominio;

public class ContaBancaria extends Pessoa{
	
	private int numeroDaConta;
	private double saldo;
	
	
	public void imprime() {
		super.imprime();
		System.out.println(this.saldo +" Na conta");
	}
	
	public int getNumeroDaConta() 
	{
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) 
	{
		this.numeroDaConta = numeroDaConta;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	
	
	
}
