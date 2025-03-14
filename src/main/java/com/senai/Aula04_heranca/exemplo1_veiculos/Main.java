package com.senai.Aula04_heranca.exemplo1_veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(
                "Honda",
                2012,
                4
        );
        Moto moto = new Moto(
                "Honda",
                2025,
                true
        );
        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
