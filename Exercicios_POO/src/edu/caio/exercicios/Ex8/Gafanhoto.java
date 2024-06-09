package edu.caio.exercicios.Ex8;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int ideade, String sexo, String login) {
		super(nome, ideade, sexo);
		this.login = login;
		this.totAssistido = 0;
	
	}

	public String isLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	
	
	
	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", \ntotAssistido=" + totAssistido + ", \nnome=" + nome + ", \nideade=" + ideade
				+ ", \nsexo=" + sexo + ", \nexperiencia=" + experiencia + "]\n\n";
	}
}
