package com.senai.Aula06_abstracao.exemplos_abstracao.Ex2_veiculo;

public class Carro extends veiculo{
    @Override
    void ligar() {
        System.out.println("vrummm, carrinho ligando");
        System.out.println("----------------------");
    }
}
