package com.senai.Aula04_herança.exemplo3_Gerenciamento_de_conta_bancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaDeRendimento) {
        super(titular, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(){
        saldo += (saldo+taxaDeRendimento)/100;
    }
}
