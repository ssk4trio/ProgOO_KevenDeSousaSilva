package model;

import interfaces.Vendavel;

public class Livro extends Produto implements Vendavel {
    private Autor autor;  // Associação: Um livro tem um autor
    private Editora editora;  // Composição: Um livro pertence a uma editora

    public Livro(String titulo, double preco, Autor autor, Editora editora) {
        super(titulo, preco);
        this.autor = autor;
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double calcularPreco() {
        // Implementação específica do cálculo de preço para o Livro
        return getPreco() * 1.10;  // Exemplo de cálculo (10% de taxa sobre o preço base)
    }
}
