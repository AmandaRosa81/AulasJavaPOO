package com.senai.Aula06_abstracao.exemplos_interface.Ex2_Veiculo;

public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
}
