package edu.caio.exercicios.Ex1;

public class Lampada {
	private String marca;
	private double voltagem;
	private String tipo;
	private String modelo;
	private String cor;
	private double preco;
	private int garantia;
	
	


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getMarca() {
		return marca;
	}
	
	public double getVoltagem() {
		return voltagem;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public double getPreco() {
		return preco;
	}
	public int getGarantia() {
		return garantia;
	}
	
	
	
}
