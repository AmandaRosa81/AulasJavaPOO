package com.senai.Aula03_encapsulamento.Cadastro_de_produto_simples;

import java.util.Objects;

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
            System.out.println("O preço do produto não pode ser negativo!");
            System.out.println("O preço do produto será exibido como R$0,0");//Vai aparecer essa mensagem, pois se o
            // valor for negativo ele vai exibir o valor inicial do atributo, que aqui no caso é um Double que 0,0
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

    //Validação de dados no setter
    public void setPreco(Double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
