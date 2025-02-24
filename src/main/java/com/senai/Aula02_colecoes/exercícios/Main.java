package com.senai.Aula02_colecoes.exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList tarefa= new ArrayList();
        int opcao;

        do{
            System.out.println("------Gerenciador de Tarefas------");
            System.out.println("\t1- Adicionar tarefa");
            System.out.println("\t2- Listar tarefas");
            System.out.println("\t3- Marcar tarefa como concluída");
            System.out.println("\t4- Remover tarefa");
            System.out.println("\t5- Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tarefa deseja adicionar?");
                    scanner.nextLine();

                    System.out.println("Nova tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("Aqui está todas as tarefas: ");
                    break;
                case 3:
                    System.out.println("Tarefa marcada com sucesso!");
                    break;
                case 4:
                    System.out.println("Tarefa removida com sucesso!");
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
            }
        }while (opcao != 6);
        System.out.println("Opção inválida");
        scanner.close();


    }
}
