package model;

public abstract class Produto {
    private String titulo;
    private double preco;

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcularPreco(); // Método abstrato a ser implementado pelas subclasses
}
