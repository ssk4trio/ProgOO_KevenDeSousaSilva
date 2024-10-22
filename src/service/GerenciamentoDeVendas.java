package service;

import model.Livro;

public class GerenciamentoDeVendas {

    public void realizarVenda(Livro livro) {
        System.out.println("Venda realizada para o livro: " + livro.getTitulo());
        System.out.println("Preço: " + livro.calcularPreco());
    }
}
