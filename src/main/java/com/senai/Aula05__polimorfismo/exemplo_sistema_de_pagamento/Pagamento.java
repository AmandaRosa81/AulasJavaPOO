package com.senai.Aula05__polimorfismo.exemplo_sistema_de_pagamento;

public class Pagamento {
    private String nome;

    public Pagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamento(){
        return 0.0;
    }
}
