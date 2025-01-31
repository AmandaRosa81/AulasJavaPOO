package com.senai.Aula01_Introducao_poo.exemplos.pessoa;

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
    }
}
