package com.senai.Aula06_abstracao.exercicios.Ex_sistema_padronizado_de_checkin_Interface;

public class Main {
    public static void main(String[] args) {
        testeCompanhia(new Gol());
        testeCompanhia(new Latam());
    }
    public static void testeCompanhia(CompanhiaAerea companhiaAerea){
        System.out.printf("------ teste %s-----\n", companhiaAerea.getClass().getSimpleName());
        CompanhiaAerea.mensagemBemVindo();
        if (companhiaAerea instanceof Gol gol){
            gol.emitirCartao();
            gol.validarDoumento();
        }
        if (companhiaAerea instanceof Latam latam){
            latam.emitirCartao();
            latam.validarDoumento();
        }
        companhiaAerea.mensagemPadrao();
    }
}
