package com.senai.Aula04_heranca.exercicios;

public class Eletronico extends Produto{
    private double voltagem;

    public Eletronico(String nome, double valor, double quantidade, double voltagem) {
        super(nome, valor, quantidade);
        this.voltagem = voltagem;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
}
