package com.senai.Aula04_heranca.exercicio01;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento(
                "Iorgute",
                12,
                0,
                "12/08/2027"
        );

        Eletronico eletronico = new Eletronico(
                "Secador de cabelo",
                300,
                2,
                220
        );

        System.out.println("--------Alimento---------");
        alimento.exibirProduto();
        alimento.getQuantidade();
        System.out.println("-------------------------");

        System.out.println("--------Eletronico---------");
        eletronico.exibirProduto();
        eletronico.getVoltagem();
        eletronico.getQuantidade();
        System.out.println("-------------------------");

    }
}
