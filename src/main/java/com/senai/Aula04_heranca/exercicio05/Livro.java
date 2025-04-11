package com.senai.Aula04_heranca.exercicio05;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirLivros(){
        System.out.println("Nome do livro: " + getTitulo() + "\n Autora: " + getAutor() + "\nótima escolha!");
    }
}
