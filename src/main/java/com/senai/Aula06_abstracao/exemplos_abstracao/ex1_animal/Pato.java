package com.senai.Aula06_abstracao.exemplos_abstracao.Ex1_animal;

public class Pato extends Animal{

    public Pato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("Quac, Quac");
    }

    void botarOvo(){
        System.out.println(nome + " virou mamãe!!!");
    }
}
