package com.senai.Aula01_Introducao_poo.exercicios;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Macarrão",
                12,
                20
        );
        Produto produto2 = new Produto(
                "Farinha",
                15,
                20
        );

        System.out.println(produto1);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        produto1.atualizaEstoque(20 - produto1.quantidade);

    }

}
