package com.senai.Aula04_herança.exemplo1_veiculos;

public class Carro extends Veiculo {
    //atributos
    private int portas;

    //construtor
    public Carro(String marca, int ano, int portas) {
        super(marca, ano);//Nessa parte ele traz, os atributos da Superclasse (a classe Pai Veiculo)
        this.portas = portas;//E aqui ele acrescenta o atributo de Carro. O "this" serve para indentificar que o
        // atributo porta é da classe Carro
    }

    //metodo gerado do override methods
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(", Portas: "+ portas);
    }

}
