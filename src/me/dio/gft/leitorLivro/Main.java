package me.dio.gft.leitorLivro;

public class Main {
    public static void main(String[] args) {
        Livro livroFavorito = new Livro("Pequeno príncipe", 10);
        Livro novoLivro = new Livro("O Hobbit", 300);

        livroFavorito.adicionarPaginasLidas();
        novoLivro.adicionarPaginasLidas();

        System.out.println(livroFavorito.verificarProgresso());

        Leitor leitor = new Leitor("Marcos", livroFavorito);
        leitor.adicionarLivro(novoLivro);
        System.out.println(leitor);

        leitor.removerLivro(novoLivro);

        System.out.println(novoLivro);
    }
}
