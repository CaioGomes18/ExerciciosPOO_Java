package edu.caio.exercicios.EXE25;

public class Book {
	
	
	private String nome;
	private String descricao;
	private double preco;
	
	
	public Book(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Book [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
	
	
	
	
}
