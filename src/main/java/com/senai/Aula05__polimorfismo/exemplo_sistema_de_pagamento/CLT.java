package com.senai.Aula05__polimorfismo.exemplo_sistema_de_pagamento;

public class CLT extends Pagamento{
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
