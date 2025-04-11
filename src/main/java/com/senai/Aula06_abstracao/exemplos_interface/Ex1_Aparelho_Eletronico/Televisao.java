package com.senai.Aula06_abstracao.exemplos_interface.Ex1_Aparelho_Eletronico;

public class Televisao implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada!");
    }
}
