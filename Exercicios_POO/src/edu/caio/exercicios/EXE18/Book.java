package edu.caio.exercicios.EXE18;


import java.util.ArrayList;

public class Book {
	protected String titulo;
	protected String autor;
	protected String ISBN;
	
	private static ArrayList<Book> bookColection = new ArrayList<Book>();

	
	
	public Book(String titulo, String autor, String iSBN) {
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public static void add_book(Book book) {
		bookColection.add(book);
	}
	public static void remove_book(Book book) {
		bookColection.remove(book);
	}
	
	
	


	public static ArrayList<Book> getBookColection() {
		return bookColection;
	}

	public static void setBookColection(ArrayList<Book> bookColection) {
		Book.bookColection = bookColection;
	}
	
	
	
}
