package com.senai.Aula04_heranca.exemplo1_veiculos;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);//Nessa parte ele traz, os atributos da Superclasse (a classe Pai Veiculo)
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida letrica: "+ (temPartidaEletrica?"Sim":"Não"));//Se a informação recebida no temPartidaeletrica for true vai ser sim, se for não
        // será false.
    }
}
