package com.senai.Aula03_encapsulamento.Cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Batata",
                12.
        );
        Produto produto2 = new Produto(
                "Feijão",
                10.
        );

        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("-----------------");
        produto1.setPreco(20.0);
        produto2.setPreco(-50.0);
        System.out.println("-----------------");
    }
}
