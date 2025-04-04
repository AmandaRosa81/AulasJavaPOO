package com.senai.Aula06_abstracao.exemplos_abstracao.Ex3_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Jamily", 500));
        testarContas(new ContaPoupanca("Bianca", 800));
    }
    private static void testarContas(ContaBancaria contaBancaria){
        System.out.printf("--------testando conta do cliente: %s---------\n", contaBancaria.titular);
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        System.out.println("---------salário com a taxa mensal---------");
        contaBancaria.exibirSaldo();
    }
}
