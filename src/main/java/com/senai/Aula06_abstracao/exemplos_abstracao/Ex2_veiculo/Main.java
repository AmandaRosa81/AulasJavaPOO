package com.senai.Aula06_abstracao.exemplos_abstracao.Ex2_veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro());
        testarVeiculo(new Moto());
    }
    private static void testarVeiculo(veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(10);
        veiculo.acelerar(20);
    }
}
