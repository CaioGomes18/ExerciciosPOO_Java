package edu.caio.exercicios.Ex8;

public class Pessoa {
	protected String nome;
	protected int ideade;
	protected String sexo;
	protected int experiencia;
	
	
	public Pessoa(String nome, int ideade, String sexo) {
		this.nome = nome;
		this.ideade = ideade;
		this.sexo = sexo;
		this.experiencia = 0;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", ideade=" + ideade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}


	protected void ganharExp() {
		this.experiencia = this.experiencia + 100;
	}
}
