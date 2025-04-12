package com.senai.Aula06_abstracao.exercicios.Ex_sistema_padronizado_de_checkin_Interface;

public class Gol implements CompanhiaAerea{
    public Gol() {
    }

    @Override
    public void validarDoumento() {
        System.out.println("Documento validado com sucesso!");
    }

    @Override
    public void emitirCartao() {
        System.out.println("Cartão emitido com sucesso!");
    }

    @Override
    public void mensagemPadrao() {
        System.out.println();
    }
}
