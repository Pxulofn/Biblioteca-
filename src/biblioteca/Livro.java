package src.Biblioteca;



public class Livro extends ItemBiblioteca {


	private String autor;
	private int numero_paginas;
	private int isbn;

	

	public void detalhes() {

		
		System.out.println(autor);
		System.out.println(isbn);

	}

}
