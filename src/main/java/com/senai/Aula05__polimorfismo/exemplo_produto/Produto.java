package com.senai.Aula05__polimorfismo.exemplo_produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome) {
        this.nome = nome;
        //this.preco = 0.0;
        // this.quantidade = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        // this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
