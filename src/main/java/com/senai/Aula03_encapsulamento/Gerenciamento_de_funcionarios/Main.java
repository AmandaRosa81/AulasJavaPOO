package com.senai.Aula03_encapsulamento.Gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------Teste1------");
        Funcionarios funcionario1 = new Funcionarios(
                "Jamily",
                2000,
                0
        );
        System.out.println(funcionario1);

        System.out.println("-------Teste2------");
        Funcionarios funcionario2 = new Funcionarios(
                "Bianca",
                1000,
                4
        );
        System.out.println(funcionario2);

        System.out.println("-------Teste3------");
        funcionario1.aumentarSalario(20);
    }
}
