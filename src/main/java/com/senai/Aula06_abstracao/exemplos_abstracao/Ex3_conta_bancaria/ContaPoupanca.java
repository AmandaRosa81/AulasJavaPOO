package com.senai.Aula06_abstracao.exemplos_abstracao.Ex3_conta_bancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo+=saldo*0.05;
    }
}
