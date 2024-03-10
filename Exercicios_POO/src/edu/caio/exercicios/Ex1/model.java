package edu.caio.exercicios.Ex1;
import java.util.Scanner;

public class model {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		
		System.out.println("digite a marca da lampada : ");
		lampada.setMarca(input.next());
		System.out.println("digite a voltagem da lampada : ");
		lampada.setVoltagem(input.nextDouble());
		System.out.println("digite o tipo da lampada : ");
		lampada.setTipo(input.next());
		System.out.println("digite o modelo da lampada : ");
		lampada.setModelo(input.next());
		System.out.println("digite a cor da lampada : ");
		lampada.setCor(input.next());
		System.out.println("digite o preço da lampada : ");
		lampada.setPreco(input.nextDouble());
		System.out.println("digite a garantia da lampada : ");
		lampada.setGarantia(input.nextInt());
		
		System.out.println(lampada.getMarca());
		System.out.println(lampada.getVoltagem());
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getTipo());
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getCor());
		System.out.println(lampada.getPreco());
		System.out.println(lampada.getGarantia());
	}
}
