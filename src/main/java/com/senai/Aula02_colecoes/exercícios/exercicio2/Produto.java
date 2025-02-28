package com.senai.Aula02_colecoes.exercícios.exercicio2;

public class Produto {
    String nomeProduto;
    int quantidadeEstoque;

    public Produto(String nomeProduto, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
