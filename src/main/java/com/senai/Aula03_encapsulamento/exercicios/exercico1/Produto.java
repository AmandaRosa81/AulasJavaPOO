package com.senai.Aula03_encapsulamento.exercicios.exercico1;

public class Produto {
    //atributos
    private String nome; //Atributo encapsulado.
    private Double preco;

    //construtor

    public Produto(String nome, Double preco) {
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        }else {
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        }
    }

    //Metodos simples de:

    //Getter
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
