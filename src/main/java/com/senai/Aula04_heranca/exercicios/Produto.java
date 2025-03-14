package com.senai.Aula04_heranca.exercicios;

public class Produto {
    //Atributos
    private String nome;
    private double valor;
    private double quantidade;

    //Construtor
    public Produto(String nome, double valor, double quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //Metodos getter e setter, para o acesso aos dados de forma controlada.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirProduto(){

    }
}
