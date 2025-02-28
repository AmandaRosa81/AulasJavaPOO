package com.senai.Aula03_encapsulamento.exercicio2;

class Conta {
    //Atributos
    private String titular;
    private double saldo;

    //Construtor
    public Conta(String titular, double saldo) { //Regra de negócio: o saldo inicial deve ser não-negativo
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos
    public double getSaldo(){ //Metodo getter
        return saldo;
    }

    //Metodo publico para deposito
    public void depositar(double valor){
        if (valor > 0){//Verifica se o valor não será negativo
            saldo += valor; //Adiciona valor ao saldo
            System.out.println("Déposito de R$ "+ valor +" reais feito com sucesso!");
        }else {
            System.out.println("Erro! Valor de déposito inválido");
        }
    }

    //Metodo publico para saque
    public void sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor; //Subtrai o valor
            System.out.println("Saque no valor de R$ "+ valor +" reais feito com sucesso!");
        }else {
            System.out.println("Saque no valor de "+ valor +" reais inválido");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
