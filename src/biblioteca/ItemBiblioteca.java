package src.Biblioteca;


public class ItemBiblioteca {



	private String nome;
	private int ano_publicacao;
	private boolean disponivel;


	public void detalhes() {

    System.out.println();

	}


	public void emprestar() {


		if (disponivel == true) {

			System.out.println("Item emprestado com Sucesso");

		}

		else {

			System.out.println("Item indisponível");

		}

	}

}

