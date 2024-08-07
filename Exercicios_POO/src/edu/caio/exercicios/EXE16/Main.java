package edu.caio.exercicios.EXE16;

public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		r1.setHeight(4);
		r1.setWidth(2);
		
		System.out.println("A área desse retangulo é " + r1.calculaAltura(r1.getWidth(), r1.getHeight()));
		System.out.println("O perimetro desse retangulo é " + r1.calculaPerimetro(r1.getWidth(), r1.getHeight()));
	}
}
