package me.dio.gft.leitorLivro;

import java.util.*;

public class Leitor {
    private String nome;
    private Livro livroFavorito;
    private Set<Livro> estanteLivro;

    public Leitor(String nome, Livro livroFavorito) {
        this.nome = nome;
        this.livroFavorito = livroFavorito;

        this.estanteLivro = new HashSet<>();
        adicionarLivro(livroFavorito);
    }

    public void adicionarLivro(Livro livro){
       estanteLivro.add(livro);
    }

    public void removerLivro(Livro livro){
        if(estanteLivro.contains(livro)) {
            livro.zerarPaginasLidas();
        }
        estanteLivro.remove(livro);
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "nome='" + nome + '\'' +
                ", \nlivroFavorito=" + livroFavorito +
                ", \nestanteLivro=" + estanteLivro +
                '}';
    }
}
