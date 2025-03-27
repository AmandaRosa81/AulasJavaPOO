package com.senai.Aula05__polimorfismo.exemplo_sistema_de_pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Pagamento> listaPagamento = new ArrayList<>();

        listaPagamento.add(new CLT("Jamily", 2500));
        listaPagamento.add(new PJ("Bianca", 24,180));
        listaPagamento.add(new Freelancers("Amanda", 100000));

        listaPagamento.forEach(pagamento -> // O forEach
                System.out.printf("%s recebe R$%,.2f\n",
                        pagamento.getNome(),
                        pagamento.calcularPagamento()
                )
        );


    }
}
