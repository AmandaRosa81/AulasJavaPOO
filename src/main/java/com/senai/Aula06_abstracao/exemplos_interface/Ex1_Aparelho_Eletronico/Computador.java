package com.senai.Aula06_abstracao.exemplos_interface.Ex1_Aparelho_Eletronico;

public class Computador implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("Computador ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado!");
    }
}
