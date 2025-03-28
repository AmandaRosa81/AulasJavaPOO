package com.senai.Aula01_Introducao_poo.exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    //Construtor
    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    //ToString
    @Override
    public String toString() {
        return "rua " + rua + "," + numero + "," + bairro + "," + cidade + "-" + estado;
    }
}