package com.senai.Aula01_Introducao_poo.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    String endereco;

    public void falar(String frase){
        System.out.println(frase);
    }
    public void comer(String alimento){
        System.out.println("Hoje eu comi: "+ alimento);

    }
}
