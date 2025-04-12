package com.senai.Aula05__polimorfismo.exercicios.exercicio_gestao_de_produtos;

public class ProdutoFisico extends Produto{
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = 0.10;
        return preco * (1+imposto);
    }
}
