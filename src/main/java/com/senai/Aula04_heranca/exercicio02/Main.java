package com.senai.Aula04_heranca.exercicio02;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(
                "Bianca",
                1000,
                1
        );
        Funcionario funcionario2 = new Funcionario(
                "Jamily",
                2000,
                2
        );

        funcionario1.exibirFuncionario();
        funcionario2.exibirFuncionario();
    }
}
