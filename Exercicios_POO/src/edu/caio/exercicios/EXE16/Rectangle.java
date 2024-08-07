package edu.caio.exercicios.EXE16;

public class Rectangle {
	protected double width;
	protected double height;
	
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double calculaAltura(double base, double altura) {
		return base * altura;
	}
	public double calculaPerimetro(double base, double altura) {
		return 2 * (base + altura);
	}
	
}
