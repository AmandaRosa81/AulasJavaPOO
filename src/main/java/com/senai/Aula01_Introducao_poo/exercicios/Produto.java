package com.senai.Aula01_Introducao_poo.exercicios;

public class Produto {
    String produto;
    int preco;
    int quantidade;

    public Produto(String produto, int preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Você comprou: "+ quantidade + " pacotes de " + produto + " no valor de " + preco + " reais ");
    }

    public void atualizaEstoque(int quantidadeNova){
        System.out.println("O estoque inicial era "+ quantidade + " agora é " + quantidadeNova);
        quantidade +=quantidadeNova;

    }
    public void calcularValorEstoque(){
        double valorDoEstoque = preco * quantidade;
        System.out.println("O valor do estoque do "+ produto + " é " + valorDoEstoque);
    }

    @Override
    public String toString() {
        return "Produto{" + "produto='" + produto + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
