package com.senai.Aula07_mvc.crud_usuario.View;

import com.senai.Aula07_mvc.crud_usuario.Controller.OperadorController;
import com.senai.Aula07_mvc.crud_usuario.Controller.SupervisorController;
import com.senai.Aula07_mvc.crud_usuario.Model.Operador;
import com.senai.Aula07_mvc.crud_usuario.Model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Menu
                            1- Cadastrar usuario
                            2- Deletar usuario
                            3- Atualizar usuario
                            4- Exibir usuario
                            5- Ligar máquina
                            6- Demitir operador
                            7- Sair
                        """;
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual tipo de usuário?");
            System.out.println("1- Operador");
            System.out.println("2- Supervisor");
            int escolhaTipo = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Preencha os dados a seguir");
                    System.out.println("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                    if (opController.cadastrarOperador(operador)){
                    System.out.println("Cadastrado com sucesso!");
                    }else {
                        System.out.println("Não foi possível cadastrar!");
                    }
                    } else if (escolhaTipo == 2) {
                    System.out.println("Àrea:");
                    String area = scanner.nextLine();
                    Supervisor supervisor = new Supervisor(nome, id, area);
                    supController.cadastrarSupervisor(supervisor);
                    }
                    break;
                case 2:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolhaTipo == 2)
                        supController.listarSuperiores().forEach(System.out::println);
                    System.out.println("Escolha um usuário pelo id para deletar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTipo == 1)
                        opController.deletarOperador(id);
                    else if (escolhaTipo == 2)
                        supController.deletarOperador(id);
                    break;
                case 3:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolhaTipo == 2)
                        supController.listarSuperiores().forEach(System.out::println);
                    System.out.println("Escolha um usuário para atualizar:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.atualizarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        System.out.println("Àrea:");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuário atualizado com sucesso!");

                    break;
                case 4:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2) {
                        supController.listarSuperiores().forEach(System.out::println);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao !=7);
    }
}
