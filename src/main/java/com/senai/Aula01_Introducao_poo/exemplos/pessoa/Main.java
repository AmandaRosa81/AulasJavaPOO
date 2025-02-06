package com.senai.Aula01_Introducao_poo.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pesso1 = new Pessoa(
                "Amanda",
                19,
                1.5f,
                new Endereco(
                        "castelinho",
                        50,
                        "Jardim Ângela",
                        "São Paulo",
                        "SP"
                )
        );
        Pessoa pesso2 = new Pessoa(
                "Jamily",
                120,
                1.6f,
                new Endereco(
                        "Av. Paulista",
                        307,
                        "bela vista",
                        "São Paulo",
                        "SP"
                )
        );

        System.out.println(pesso1);

        pesso1.falar("Falta pouco, falta pouco! Sabe pra que? Pra paparmos um franguinha da libaaa");
        pesso1.comer("Um fraguinho da libaaa");
        pesso2.falar("Amei debulhar o franguinho kkkkk");
        pesso2.comer("um franguinho na libaaa");


        Scanner scanner = new Scanner(System.in);

        String[] etiquetas ={"Nome: ", "Idade: ", "Altura: ", "Endereço:\n\trua:",
        "\tnumero: ", "\tbairro: ", "\tcidade: ", "\testado: "};
        String[] dados = new String[etiquetas.length];

        System.out.println("Preencha as informações a seguir: ");
        for (int i = 0; i < etiquetas.length; i++) {
            System.out.println(etiquetas[i]);
            dados[i] = scanner.nextLine();
        }

        Pessoa pessoa3 = new Pessoa (
                dados [0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                )
        );
        System.out.println(pessoa3);
    }
}
