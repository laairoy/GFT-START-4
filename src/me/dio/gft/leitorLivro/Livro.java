package me.dio.gft.leitorLivro;

import java.util.Objects;

public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo, int qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = 0;
    }

    public double verificarProgresso() {
        return Math.floor( 100.0/qtdPaginas * paginasLidas);

    }

    public int adicionarPaginasLidas() throws IllegalArgumentException {
        if(paginasLidas + 1 > qtdPaginas){
            throw new IllegalArgumentException("Não é possível ler mais páginas");
        }

        paginasLidas++;
        return paginasLidas;
    }

    public void zerarPaginasLidas(){
       this.paginasLidas = 0;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", paginasLidas=" + paginasLidas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
