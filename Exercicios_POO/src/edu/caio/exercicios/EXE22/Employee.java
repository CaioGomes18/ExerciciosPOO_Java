package edu.caio.exercicios.EXE22;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	protected String nome;
	protected double salario;
	protected LocalDate dataDeAdimissao;
	
	
	public Employee(String nome, double salario, LocalDate dataDeAdimissao) {
		this.nome = nome;
		this.salario = salario;
		this.dataDeAdimissao = dataDeAdimissao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public LocalDate getDataDeAdimissao() {
		return dataDeAdimissao;
	}


	public void setDataDeAdimissao(LocalDate dataDeAdimissao) {
		this.dataDeAdimissao = dataDeAdimissao;
	}
	
	public int anosDeServico() {
		return Period.between(dataDeAdimissao,LocalDate.now()).getYears();
	}
	
	
	public void dadosEmpregado() {
		System.out.println("Nome do Empregado " + this.nome);
		System.out.println("Salario do empregado " + this.salario);
		System.out.println("Data de Admissão " + this.dataDeAdimissao);
	}
	
	
}
