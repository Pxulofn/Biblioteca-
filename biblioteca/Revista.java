package biblioteca;

public class Revista extends ItemBiblioteca {
 
 	
 	private int numero;
 	private String periodicidade;
 	private String editora;
 
 	public void detalhes( ) {
 
 		System.out.println(numero);
 		System.out.println(editora);
 
 	}
 	
 	public int getNumero() {
 		return numero;
 	}
 	
 	public void setNumero(int numero) {
 		this.numero = numero;
 	}
 	
 	public String getPeriodicidade() {
 		return periodicidade;
 	}
 	
 	public void SetPeriodicidade(String periodicidade) {
 		this.periodicidade = periodicidade;
 	}
 	
 	public String getEditora () {
 		return editora;
 	}
 	
 	public void setEditora (String editora) {
 		this.editora = editora;
 	}
 
 
 }