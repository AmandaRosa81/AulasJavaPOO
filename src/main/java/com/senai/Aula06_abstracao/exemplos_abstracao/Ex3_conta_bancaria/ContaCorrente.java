package com.senai.Aula06_abstracao.exemplos_abstracao.Ex3_conta_bancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo-=20;
    }
}
