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
        System.out.println("Há no mercado Nikkey " + quantidade + " pacotes de " + produto + " no estoque,no valor de R$ " + preco + " a unidade.");
    }

    public void atualizaEstoque(int quantidadeNova){
        System.out.println("O estoque inicial do(a) "+ produto + " era " + quantidade + " agora é " + (quantidade +=quantidadeNova));

    }
    public void calcularValorEstoque(int quantidadeNova){
        double valorDoEstoque = preco * quantidadeNova;
        System.out.println("O valor do estoque do(a) "+ produto + " é " + valorDoEstoque);
    }

    @Override
    public String toString() {
        return "Produto{" + "produto='" + produto + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
