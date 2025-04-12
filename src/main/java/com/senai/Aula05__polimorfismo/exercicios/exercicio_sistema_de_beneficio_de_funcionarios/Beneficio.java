package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_beneficio_de_funcionarios;

public abstract class Beneficio {
    protected String nome;

    public Beneficio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularDesconto(double salario);
}
