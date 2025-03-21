package com.senai.Aula05__polimorfismo.exemplo_animais;

public class Main {
    public static void main(String[] args) {
        //testarSomAnimal(new Cachorro()); //Aqui está assim, porque se deixarmos o Cachorro vai dar erro! Pois cachorro
        // não voa
        testarSomAnimal(new Pato());
    }

    public static void testarSomAnimal(Animal animal){
        animal.fazerSom();
        Pato pato = (Pato) animal;//Para conseguirmos fazer o pato voar, fizemos o casting (tomamos a responsabilidade
        // de fazer o pato voar)
        pato.voar();
    }
}
