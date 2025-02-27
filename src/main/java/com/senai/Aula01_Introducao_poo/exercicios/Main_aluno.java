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
                10
        );
        Aluno aluno = new Aluno(
                "Jamily",
                20,
                10
        );


        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---Gerenciamento de Alunos---");
            System.out.println("\t1- Exibir informações");
            System.out.println("\t2- Atualizar nota");
            System.out.println("\t3- Verificar aprovação");
            System.out.println("\t4- sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }while (opcao != 5);
        System.out.println("Opção inválida");
        scanner.close();

    }
}

