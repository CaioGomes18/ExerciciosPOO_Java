package edu.caio.exercicios.EXE18;


import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("pequeno principe", "José Porteier", "128548316351");
		Book book2  = new Book("Fazendo a diferença", "Meu amigo", "1234567890");
		
		Book.add_book(book1);
		Book.add_book(book2);
		
		ArrayList <Book> bookCollection = Book.getBookColection();
		
		System.out.println("LIsta de Livros");
		
		for(Book book : bookCollection) {
			System.out.println("Titulo :" + book.getTitulo() + ", Autor :" + book.getAutor() + ", ISBN :" + book.getISBN());
		}
		
		
		Book.remove_book(book1);
		
		// Exibindo uma mensagem para mostrar que o livro foi exclido;
        System.out.println("\nAfter removing " + book1.getTitulo() + ":");
        
        
        for(Book i : bookCollection) {
        	System.out.println("Titulo :" + i.getTitulo() + ", Autor :" + i.getAutor() + ", ISBN :" + i.getISBN());
        }
		
	}
}
