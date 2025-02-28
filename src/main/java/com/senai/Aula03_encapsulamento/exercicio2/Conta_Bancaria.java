package com.senai.Aula03_encapsulamento.exercicio2;

public class Conta_Bancaria {
    public static void main(String[] args) {
        Conta conta1 = new Conta(
                "Amanda",
                1700
        );

        System.out.println(conta1);

        //Teste de deposito
        System.out.println("Saldo inicial: "+ conta1.getSaldo());
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
        System.out.println("Saldo inicial: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
        conta1.depositar(-150);
        System.out.println("Saldo sem alteração: "+ conta1.getSaldo());
        System.out.println("-------------------------------");

        //Teste de saque negativo
        System.out.println("Saldo inicial: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
        conta1.depositar(-60);
        System.out.println("Saldo sem alteração: "+ conta1.getSaldo());
        System.out.println("-------------------------------");
    }
}
