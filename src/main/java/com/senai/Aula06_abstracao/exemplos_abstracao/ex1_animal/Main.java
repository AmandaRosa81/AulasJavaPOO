package com.senai.Aula06_abstracao.exemplos_abstracao.ex1_animal;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Cachorro("Rex"));
        testarAnimal(new Pato("Alexandre"));
    }
    private static void testarAnimal(Animal animal){
        animal.dormmir();
        animal.fazerSom();
        if (animal instanceof Pato pato){// o if vai servir para só selecionar o Pato para botar ovo.
            // Assim não deixando o cachorro botar ovo kkk
            pato.botarOvo();
        }
    }
}
