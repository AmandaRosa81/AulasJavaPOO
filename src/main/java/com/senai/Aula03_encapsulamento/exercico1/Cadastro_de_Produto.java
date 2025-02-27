package com.senai.Aula03_encapsulamento.exercico1;

public class Cadastro_de_Produto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Batata",
                12.
        );
        System.out.println(produto1);

        produto1.getNome();
        produto1.getPreco();

        produto1.setNome("Batata");
        produto1.setPreco(12.);
    }
}
