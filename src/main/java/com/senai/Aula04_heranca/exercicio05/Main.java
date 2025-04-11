package com.senai.Aula04_heranca.exercicio05;

public class Main {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Verity", "Collen Hoveer", 10);
        LivroFisico livroFisico = new LivroFisico("Sem Coração", "Marissa Mayer", 300);

        livroDigital.exibirLivros();
        System.out.println("---------------------------");
        livroFisico.exibirLivros();
    }

}
