package edu.caio.exercicios.EXE17;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.setRadius(8);
		System.out.println("O perimetro desse circulo é " + c.calculaPerimetro(c.getRadius()) + " cm");
		System.out.println("A área desse circulo é " + c.calculaArea(c.getRadius()) + " cm");
	}
}
