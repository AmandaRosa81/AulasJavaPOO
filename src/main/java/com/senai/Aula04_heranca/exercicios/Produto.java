package com.senai.Aula04_heranca.exercicios;

public class Produto {
    //Atributos
    private String nome;
    private double valor;
    private double quantidade;

    //Construtor
    public Produto(String nome, double valor, double quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    //Metodos getter e setter, para o acesso aos dados de forma controlada.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {//Regra de negócio: o valor não pode ser negativo
        if (valor > 0){
            this.valor = valor;
        }else {
            System.out.println("O valor do produto não pode ser negativo!");
        }

    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {//Regra de negócio: a quantidade não pode ser menor que 0.
        if (quantidade >= 0){
            this.quantidade = quantidade;
        }else {
            System.out.println("A quantidade de produtos,não pode ser menor que zero!");
        }
    }

    public void exibirProduto(){
        System.out.printf("Nome: %s , Valor: R$%,.2f, Quantidade: %f\n", getNome(), getValor(), getQuantidade());
        //Especificadores: %s para String, %d para Inteiro, %f para Double ou Floute.
    }
}
