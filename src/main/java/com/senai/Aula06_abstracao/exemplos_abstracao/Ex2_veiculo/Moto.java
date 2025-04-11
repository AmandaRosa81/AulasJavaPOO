package com.senai.Aula06_abstracao.exemplos_abstracao.Ex2_veiculo;

public class Moto extends veiculo{
    @Override
    void ligar() {
        System.out.println("vrumm, motinha ligada");
        System.out.println("----------------------");
    }
}
