package com.senai.Aula01_Introducao_poo.exemplos.concessionaria;

public class Carro {
    String modelo;
    int anodefabricacao;
    String cor;
    String marca;
    String placa;
    double preco;

    //Construtor
    public Carro(String modelo, int anodefabricacao, String cor, String marca, String placa, double preco) {
        this.modelo = modelo;
        this.anodefabricacao = anodefabricacao;
        this.cor = cor;
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }

    public void testeDriver(){
        System.out.println("Vrummm!"+ modelo + "sendo testado.");
    }
    public void comprar(String nomeCliente){
        System.out.println("Parabéns!"+ nomeCliente + " você comprou um carro modelo "+ modelo + " da marca "+ marca);
    }

    public void valorTabelaFipe(int anoReferencia){
        int idadeCarro = anoReferencia - this.anodefabricacao;
        double valorComDesvalorizacao = preco;

        for (int i = 0; i < idadeCarro; i++) {
            valorComDesvalorizacao -= valorComDesvalorizacao*0.02;
        }
        System.out.printf("O %s no ano %d vale R$%,.2f na tabela fipe",
                modelo,anoReferencia,valorComDesvalorizacao);
    }

    //ToString
    @Override
    public String toString() {
        return "Carro{" + "modelo='" + modelo + '\'' +
                ", anodefabricacao=" + anodefabricacao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' + ", preço ='" + preco + '\'' +
                '}';
    }
}
