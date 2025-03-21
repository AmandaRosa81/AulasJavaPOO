package com.senai.Aula05__polimorfismo.exemplo_produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz");
        Produto produto2 = new Produto("Feijão", 10);
        Produto produto3 = new Produto("Macarrão", 4.2, 3);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
