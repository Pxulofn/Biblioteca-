package biblioteca;


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

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoPublicacao() {
		return ano_publicacao;
	}
	
	public void setAnoPublicacao(int ano_publicacacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}