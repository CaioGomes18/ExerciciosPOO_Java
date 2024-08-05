package edu.caio.exercicios.EXE13.Executavel;


import edu.caio.exercicios.EXE13.Service.CalcularImposto;
import edu.caio.exercicios.EXE13.domain.*;
public class ClasseEXE {
	public static void main(String[] args) {
		Product produto =  new CellPhone("Iphone 12", 4500);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		CalcularImposto.calculandoImposto(produto);
		
	}
}
