package edu.caio.exercicios.Ex5.dominio;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String email;
	private boolean loop = false; 
	
	
	public void imprime() {
		System.out.println(this.nome.toUpperCase() + " você encerrou a aplicação com :");
	}
	public void setLoop() 
	{
		this.loop = true;
	}
	
	public boolean getLoop() 
	{
		return loop;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	
}
