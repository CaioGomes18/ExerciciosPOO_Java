package edu.caio.exercicios.Ex3.dominio;

public class Circulo {
	private double raio;
	private double pi = 3.14;
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void fazerCalculos() {
		double resp = perimetro(this.raio);
		double rest = area(this.raio);
		System.out.println("Area do circulo : " + rest );
		System.out.println("Circunferencia do circulo : " + resp );

	}
	
	private double perimetro(double r) {
		double c = 2 * pi * r;
		return c;
	}
	private double area(double r) {
		double a = pi *(r*r);
		return a;
	}
	
}
