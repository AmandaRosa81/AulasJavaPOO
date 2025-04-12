package com.senai.Aula05__polimorfismo.exercicios.exercicio_gestao_de_produtos;

public class ProdutoServico extends Produto{
    public ProdutoServico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = 0.07;
        return preco*(1+imposto);
    }


}
