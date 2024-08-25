package edu.caio.exercicios.EXE23;

import java.util.List;
import java.util.*;

public class Biblioteca {
	
	
	List<Livro> livros = new ArrayList<>();

	public Biblioteca() {
		this.livros = null;
	}
	
	public void add(List<Livro> livros) {
		this.livros = livros;
	}
	
	@Override
	public String toString() {
		
		String strRetorno = "";
		if(this.livros != null) {
			for(Livro i : this.livros) {
				strRetorno += "Livro -> [Nome = "+ i.getNome() + "] [autor = " + i.getAutor() + "] [Preço = " + i.getPreco() + "]\n";
			}
		}
		
		if(this.livros == null)
			strRetorno += "null";
		
		return strRetorno;
		
	}
	
	
	
}
