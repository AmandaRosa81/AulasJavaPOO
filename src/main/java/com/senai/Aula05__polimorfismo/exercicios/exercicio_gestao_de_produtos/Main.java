package com.senai.Aula05__polimorfismo.exercicios.exercicio_gestao_de_produtos;

public class Main {
    public static void main(String[] args) {
        Produto livro = new ProdutoFisico("Verity", 45);
        Produto ebook = new ProdutoDigital("Estilhaça-me", 25);
        Produto secretaria = new ProdutoServico("Secretaria", 1600);

        System.out.printf("%s - Preço final: R$%,.2f%n", livro.getNome(), livro.getPreco());
        System.out.printf("%s - Preço final: R$%,.2f%n", ebook.getNome(), ebook.getPreco());
        System.out.printf("%s - Valor á receber R$%,.2f%n", secretaria.getNome(), secretaria.getPreco());
    }
}
