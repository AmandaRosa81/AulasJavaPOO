package com.senai.Aula05__polimorfismo.exercicios.exercicio_gestao_de_produtos;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = 0.05;
        return preco*(1+imposto);
    }
}
