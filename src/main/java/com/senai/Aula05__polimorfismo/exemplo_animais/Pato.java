package com.senai.Aula05__polimorfismo.exemplo_animais;

public class Pato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("Quac quac, sou o patinho da Jamily :3");
    }
    void voar(){
        System.out.println("Nenhum patinho voltou de lá ;(");
    }
}
