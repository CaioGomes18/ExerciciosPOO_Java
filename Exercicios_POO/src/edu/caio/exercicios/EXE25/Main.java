package edu.caio.exercicios.EXE25;

import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String [] args) {
		
		
		Library livraria = new Library("Travessa", "Rua Visconde de pirajá");
		
		List<Book> listaProvisoria = new ArrayList<>();
		
		Book book1= new Book("Pequeno Principe", "Fala sobre um pequeno principe", 20d);
		Book book2= new Book("O poder da Mente", "Esquisofrenico com cara de morador de rua que controla mentes", 55d);
		Book book3= new Book("O poder da ação", "O poder de fazer as coisas", 77d);
		Book book4= new Book("Perdido em Nova York", "principe fica perdido em nova york", 90d);
		Book book5= new Book("Minha mãe é um pessa", "Fala sobre a mãe do paulo gustavo", 45d);
		
		listaProvisoria.add(book1);
		listaProvisoria.add(book2);
		listaProvisoria.add(book3);
		listaProvisoria.add(book4);
		listaProvisoria.add(book5);
		
		livraria.addBooks(listaProvisoria);
		
		System.out.println(livraria);
		
		livraria.removeBook(book2);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(livraria);
		
		
		
		
	}
}
