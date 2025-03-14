package com.senai.Aula04_heranca.exercicios;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento(
                "Iorgute",
                12,
                2,
                "12/08/2027"
        );

        Eletronico eletronico = new Eletronico(
                "Secador de cabelo",
                300,
                2,
                220
        );

        alimento.exibirProduto();
        eletronico.exibirProduto();
    }
}
