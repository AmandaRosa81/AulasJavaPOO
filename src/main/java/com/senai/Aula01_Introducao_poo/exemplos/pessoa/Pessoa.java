package com.senai.Aula01_Introducao_poo.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    //Construtor
    public Pessoa(String nome, int idade, float altura, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    //
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar(String frase){
        System.out.println(nome + " falou: " + frase);
    }
    public void comer(String alimento){
        System.out.println(nome + " comeu: " + alimento);
    }

    //ToString

    @Override
    public String toString() {
        return "Meu nome é " + this.nome +" tenho " + this.idade +
                " anos, e " + this.altura + " de altura e atualmente moro no endereço " + this.endereco;

    }
}
