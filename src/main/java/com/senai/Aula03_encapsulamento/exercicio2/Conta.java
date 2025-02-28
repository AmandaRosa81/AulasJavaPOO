package com.senai.Aula03_encapsulamento.exercicio2;

class Conta {
    //Atributos
    private String titular;
    double saldo;

    //Construtor
    public Conta(String titular, double saldo) { //Regra de negócio: o saldo inicial deve ser não-negativo
        this.titular = titular;
        if (saldo > 0){
            this.saldo = saldo;
        }else {
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        }
    }

    public double getSaldo() { //Metodo getter para visualizar
        return saldo;
    }

    //Métodos
    public void depositar(double valor){
        if (valor > 0){//Verifica se o valor não será negativo
            saldo += valor; //Adiciona valor ao saldo
            System.out.println("Déposito de R$ "+ valor +" reais feito com sucesso!");
        }else {
            System.out.println("Valor de déposito inválido");
        }
    }

    public void sacar(double valor){

    }


}
