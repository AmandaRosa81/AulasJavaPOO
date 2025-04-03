package com.senai.Aula06_abstracao.exemplos_interface.Aparelho_Eletronico;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new Computador());
        testarAparelhos(new Televisao());
    }
    public static void testarAparelhos(AparelhoEletronico aparelhoEletronico){
        System.out.println("------testando aparelhos------");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
