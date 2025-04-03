package com.senai.Aula06_abstracao.exemplos_abstracao.ex_2veiculo;

public class Main {
    public static void main(String[] args) {
        testrVeiculo(new Carro());
        testrVeiculo(new Moto());
    }
    private static void testrVeiculo(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(10);
        veiculo.acelerar(20);
    }
}
