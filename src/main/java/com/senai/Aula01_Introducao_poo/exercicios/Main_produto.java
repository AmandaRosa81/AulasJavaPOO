package com.senai.Aula01_Introducao_poo.exercicios;

public class Main_produto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Macarrão",
                12,
                20
        );
        Produto produto2 = new Produto(
                "Farinha",
                15,
                25
        );

        System.out.println(produto1);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        produto1.atualizaEstoque(5);
        produto2.atualizaEstoque(8);

     produto1.calcularValorEstoque(25);
     produto2.calcularValorEstoque(33);

    }

}
