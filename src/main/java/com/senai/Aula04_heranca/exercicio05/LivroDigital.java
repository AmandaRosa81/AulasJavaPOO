package com.senai.Aula04_heranca.exercicio05;

public class LivroDigital extends Livro{
    private double tamanhoDoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoDoArquivo) {
        super(titulo, autor);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public double getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    @Override
    public void exibirLivros() {
        System.out.println("Nome do livro: " + getTitulo() + "\nAutor: " + getAutor() +
                "\nAtenção! Tamanho do arquivo em MB: " + getTamanhoDoArquivo() + "MB");
    }
}
