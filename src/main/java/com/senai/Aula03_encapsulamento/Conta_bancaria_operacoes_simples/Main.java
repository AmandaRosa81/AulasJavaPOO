package com.senai.Aula03_encapsulamento.Conta_bancaria_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        Conta_Bancaria conta1 = new Conta_Bancaria(
                "Amanda",
                1700
        );
        Conta_Bancaria conta2 = new Conta_Bancaria(
                "Bianca Neves",
                1500
        );

        System.out.println(conta1);

        //Teste de deposito
        System.out.println("-------------------------------");
        conta1.depositar(200);
        System.out.println("Saldo após o déposito: "+ conta1.getSaldo());
        System.out.println("-------------------------------");

        //Teste de saque
        System.out.println("Saldo atual: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
        conta1.sacar(300);
        System.out.println("Saldo após o saque: "+ conta1.getSaldo());
        System.out.println("-------------------------------");

        //Teste de deposito negativo
        System.out.println("Saldo atual: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
        conta1.depositar(-150);
        System.out.println("Saldo sem alteração: "+ conta1.getSaldo());
        System.out.println("-------------------------------");

        //Teste de saque negativo
        System.out.println("Saldo atual: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
        conta1.depositar(-60);
        System.out.println("Saldo sem alteração: "+ conta1.getSaldo());
        System.out.println("-------------------------------");

    }
}
