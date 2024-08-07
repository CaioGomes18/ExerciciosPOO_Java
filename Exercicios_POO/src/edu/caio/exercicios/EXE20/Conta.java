package edu.caio.exercicios.EXE20;

public class Conta {
	protected String numeroDaConta;
	protected String nome;
	protected double balanco;
	
	
	public Conta(String numeroDaConta, String nome, double balanco) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.balanco = balanco;
	}
	
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getBalanco() {
		return balanco;
	}
	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}
	
	public void deposito(double valorDeposito) {
		balanco += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		balanco -= valorSaque;
	}
	
	public void imprimirDadosDaConta() {
		System.out.println("Número da Conta : " + this.numeroDaConta);
		System.out.println("Titular da Conta : " + this.nome);
		System.out.println("Balanço da Conta" + this.balanco);
	}
}
