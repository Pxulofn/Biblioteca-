package biblioteca;

public class Livro extends ItemBiblioteca {
	 
	 
 	private String autor;
 	private int numero_paginas;
 	private String isbn;
 
 	
 
 	public void detalhes() {
 
 		
 		System.out.println(autor);
 		System.out.println(isbn);
 
 	}
 	
 	public String getAutor() {
 		return autor;
 	}
 	
 	public void setAutor(String autor) {
 		 this.autor = autor;
 	}
 	
 	public int getNumero_Paginas() {
 		return numero_paginas;
 	}
 	
 	public void SetNumero_Paginas(int numero_paginas) {
 		this.numero_paginas = numero_paginas;
 	}
 	
 	public String getIsbn() {
 		return isbn;
 	}
 	
 	public void setIsbn(String isbn) {
 		this.isbn = isbn;
 	}
 
 }