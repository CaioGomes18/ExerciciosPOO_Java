package edu.caio.exercicios.EXE17;

public class Circle {
	protected double radius;
	protected double pi = 3.14;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double calculaArea(double raio) {
		return this.pi * (Math.pow(raio, 2));
	}
	
	public double calculaPerimetro(double raio) {
		return 2 * this.pi * raio; 
	}
	
	
}
