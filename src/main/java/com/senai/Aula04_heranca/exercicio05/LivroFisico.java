package com.senai.Aula04_heranca.exercicio05;

public class LivroFisico extends Livro{
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public void exibirLivros() {
        System.out.println("Nome do livro: " + getTitulo() + "\nAutor: " + getAutor() +
                "\nNúmero de páginas desse livro: " + getNumeroDePaginas());
    }
}
