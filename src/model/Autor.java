package model;

import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livros;  // Agregação: Um autor pode ter vários livros.

    public Autor(String nome, int idade) {
        super(nome, idade);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}
