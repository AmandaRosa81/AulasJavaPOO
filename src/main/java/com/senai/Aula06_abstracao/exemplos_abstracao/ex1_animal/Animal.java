package com.senai.Aula06_abstracao.exemplos_abstracao.ex1_animal;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormmir(){
        System.out.println(nome + " está dormindo");
    }

    abstract void fazerSom();
}
