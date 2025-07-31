package com.senai.Aula08_CleanCode.Exercicios;

public class ContaPoupancaCleanCode extends ContaBancariaCleanCode {
    private double taxaDeRendimento;

    public ContaPoupancaCleanCode(String titularDaConta, double saldoDaContaBancaria, double taxaDeRendimento) {
        super(titularDaConta, saldoDaContaBancaria);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(){
        saldoDaContaBancaria += (saldoDaContaBancaria+taxaDeRendimento)/100;
    }
}
