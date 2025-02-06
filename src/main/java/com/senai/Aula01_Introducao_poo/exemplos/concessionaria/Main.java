package com.senai.Aula01_Introducao_poo.exemplos.concessionaria;

import java.security.cert.CRLReason;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Porsche",
                2025,
                "Verde Escuro",
                "911 GT3 Touting Package",
                "S2AMD5",
                200000

        );
        Carro carro2 = new Carro(
                "Porsche",
                2015,
                "Rosa",
                "911 Turbo S Cabriolet",
                "35BIA2",
                500000
        );
        Carro carro3 = new Carro(
                "Mazda",
                1980,
                "Preto",
                "Miata",
                "6MIMY40",
                80000
        );

        System.out.println(carro1);

        carro1.comprar("Amanda");
        carro1.testeDriver();
        carro2.comprar("Bianca");
        carro2.testeDriver();
        carro2.valorTabelaFipe(2018);
        carro3.comprar("Jamily");
        carro3.testeDriver();
        carro3.valorTabelaFipe(2025);
    }

}
