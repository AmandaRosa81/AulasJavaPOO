package com.senai.Aula06_abstracao.exemplos_abstracao.ex1_animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("Au,Au");
    }
}
