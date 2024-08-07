package edu.caio.exercicios.EXE19;

public class Funcionario {
	protected String nome;
	protected String tituloDeTrabalho;
	protected double salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTituloDeTrabalho() {
		return tituloDeTrabalho;
	}
	public void setTituloDeTrabalho(String tituloDeTrabalho) {
		this.tituloDeTrabalho = tituloDeTrabalho;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", tituloDeTrabalho=" + tituloDeTrabalho + ", salario=" + salario + "]";
	}
	public Funcionario(String nome, String tituloDeTrabalho, double salario) {
		this.nome = nome;
		this.tituloDeTrabalho = tituloDeTrabalho;
		this.salario = salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		this.salario = this.salario + this.salario * (porcentagem /100);
	}
	
}
