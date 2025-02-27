package com.senai.Aula01_Introducao_poo.exercicios;

import java.util.Scanner;

public class Main_aluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Amanda",
                19,
                9
        );
        Aluno aluno2 = new Aluno(
                "Bianca",
                19,
                4
        );
        Aluno aluno3 = new Aluno(
                "Jamily",
                20,
                6
        );

        System.out.println(aluno1);
        System.out.println("-----------------");
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
        System.out.println("-----------------");
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
        aluno3.verificarAprovacao();
        System.out.println("-----------------");
        aluno2.atualizarNota(9);

    }
}

