package edu.caio.exercicios.EXE25;

import java.util.List;

import java.util.ArrayList;

public class Library {
	
	
	private String nome;
	private String endereco;
	private List<Book> livrosBiblioteca = new ArrayList<>();
	
	
	
	
	
	public Library(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void addBooks(List<Book> listaAux) {
		this.livrosBiblioteca.addAll(listaAux);
	}
	
	public void removeBook(Book bookAux) {
		
		this.livrosBiblioteca.remove(bookAux);
	}

	@Override
	public String toString() {
		
		String strRetorno = "";
		
		strRetorno += "Library [ Nome = " + nome + " ]\n";
		strRetorno += "endereço [ Endereço = " + endereco+ " ]\n";
		
		for(int i = 0; i < livrosBiblioteca.size(); i++) {
			strRetorno += "Livro [ Nome = " + livrosBiblioteca.get(i).getNome() + " ]";
			strRetorno += "Livro [ Descrição = " + livrosBiblioteca.get(i).getDescricao() + " ]";
			strRetorno += "Livro [ Preço = " + livrosBiblioteca.get(i).getPreco() + " ]\n";
		}
		
		strRetorno += "\n\n";
		
		return strRetorno;
	}
	
	

}
