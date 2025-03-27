package com.senai.Aula05__polimorfismo.exemplo_sistema_de_pagamento;

public class Freelancers extends Pagamento{
    private double valorProjeto;

    public Freelancers(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
