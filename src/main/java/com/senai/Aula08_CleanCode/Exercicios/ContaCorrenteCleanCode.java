package com.senai.Aula08_CleanCode.Exercicios;

public class ContaCorrenteCleanCode extends ContaBancariaCleanCode {
    private double limiteDaConta;

    public ContaCorrenteCleanCode(String titularDaConta, double saldoDaContaBancaria, double limiteDaConta) {
        super(titularDaConta, saldoDaContaBancaria);
        this.limiteDaConta = limiteDaConta;
    }

    public double getLimiteDaConta() {
        return limiteDaConta;
    }

    public void setLimiteDaConta(double limiteDaConta) {
        this.limiteDaConta = limiteDaConta;
    }

    public boolean sacar (double valorSacado){
        if (valorSacado <= (saldoDaContaBancaria+limiteDaConta) && valorSacado > 0){
            saldoDaContaBancaria -= valorSacado;
            System.out.println("Saque no valor de R$ "+ valorSacado +" realizado com sucesso do(a) titular "+ getTitular() +
                    ".\nSaldo atualizado: R$ "+ saldoDaContaBancaria);
            return true;
        }else if (valorSacado > saldoDaContaBancaria){
            System.out.println("Erro! Saldo insuficiente para realizar o saque!");
            return false;
        }else {
            System.out.println("Erro! O valor do saque deve ser positivo!");
            return false;
        }
    }
}
