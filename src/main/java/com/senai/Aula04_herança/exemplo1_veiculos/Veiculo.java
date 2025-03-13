package com.senai.Aula04_herança.exemplo1_veiculos;

public class Veiculo {
    //atributos
    private String marca;
    private int ano;

    //construtor
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    //metódos getter setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Metodo comum para os veiculos
    public void exibirDetalhes(){
        System.out.print("Marca: "+ marca +" Ano: "+ ano);
    }
}
