package com.senai.Aula08_CleanCode.Exemplos;

public class Main {
    public static void main(String[] args) {
        ContaCorrenteCleanCode contaCorrente = new ContaCorrenteCleanCode(
                "Jamily",
                10000,
                200
        );
        ContaPoupancaCleanCode contaPoupanca = new ContaPoupancaCleanCode(
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
