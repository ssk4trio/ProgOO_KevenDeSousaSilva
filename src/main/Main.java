package main;

import model.Autor;
import model.Editora;
import model.Livro;
import service.GerenciamentoDeVendas;

public class Main {
    public static void main(String[] args) {
        Editora editora = new Editora("Editora ABC");
        Autor autor = new Autor("J.K. Rowling", 55);
        
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 39.90, autor, editora);
        autor.adicionarLivro(livro);

        GerenciamentoDeVendas vendas = new GerenciamentoDeVendas();
        vendas.realizarVenda(livro);
    }
}
