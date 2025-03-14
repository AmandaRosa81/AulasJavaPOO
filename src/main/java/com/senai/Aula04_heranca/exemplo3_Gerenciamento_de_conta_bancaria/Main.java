package com.senai.Aula04_heranca.exemplo3_Gerenciamento_de_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(
                "Jamily",
                10000,
                200
        );
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "Bianca",
                1000,
                10
        );

        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        System.out.println("-----teste conta corrente-----");
        contaCorrente.sacar(11000);
        contaCorrente.sacar(200);
        contaCorrente.sacar(10000);
        System.out.println("------------------------------\n");

        System.out.println("-----teste Conta Poupança-----");
        contaPoupanca.aplicarRendimento();
        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();
        System.out.println("------------------------------");


    }
}
