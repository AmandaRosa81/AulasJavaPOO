package com.senai.Aula04_heranca.exercicios;

public class Alimento extends Produto{
    private int dataDeValidade;

    public Alimento(String nome, double valor, double quantidade, int dataDeValidade) {
        super(nome, valor, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public int getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(int dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
