package biblioteca;


public class Principal {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.setNome("Dom Casmurro");
        livro1.setAnoPublicacao(1899);
        livro1.setDisponivel(true);
        livro1.setAutor("Machado de Assis");
        livro1.SetNumero_Paginas(256);
        livro1.setIsbn("978853590277");

        
        Revista revista1 = new Revista();
        revista1.setNome("Veja");
        revista1.setAnoPublicacao(2023);
        revista1.setDisponivel(true);
        revista1.setNumero(234);
        revista1.SetPeriodicidade("Semanal");
        revista1.setEditora("Abril");
        
        
        Usuario usuario1 = new Usuario();
        usuario1.setNome("João Silva");
        usuario1.setId_Usuario(1);
        
        
        System.out.println("--- Detalhes dos Itens ---");
        livro1.detalhes();
        System.out.println(); 
        revista1.detalhes();
        
        System.out.println("\n--- Testando Empréstimos ---");
        livro1.emprestar(); 
        livro1.emprestar(); 
        
        
    }
}



