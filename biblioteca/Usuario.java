package biblioteca;

import java.util.ArrayList;

public class Usuario extends ItemBiblioteca {

	private String nome;
	private int id_usuario;
	private ArrayList<ItemBiblioteca> ItensEmprestados = new ArrayList();
	
	public int getId_Usuario() {
		return id_usuario;
	}
	
	public void setId_Usuario (int id_usuario) {
		this.id_usuario = id_usuario;
	}

}