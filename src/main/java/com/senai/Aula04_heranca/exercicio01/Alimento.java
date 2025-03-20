package com.senai.Aula04_heranca.exercicio01;

public class Alimento extends Produto{
    private String dataDeValidade;

    public Alimento(String nome, double valor, double quantidade, String dataDeValidade) {
        super(nome, valor, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;

    }

    public void exibirProduto(){
        System.out.printf("Nome: %s , Valor: R$%,.2f , Quantidade: %,.2f , Data de validade: %s\n", getNome()
        , getValor(), getQuantidade(), getDataDeValidade());
    }
}
