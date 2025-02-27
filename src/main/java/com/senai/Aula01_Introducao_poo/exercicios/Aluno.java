package com.senai.Aula01_Introducao_poo.exercicios;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    int nota;

    public Aluno(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Nota: "+ nota);

        if (nota >= 6){
            System.out.println("Situação: Aprovado");
        }else {
            System.out.println("Situação: Reprovado");
        }
    }
    public void atualizarNota(int novaNota){
        this.nota = novaNota;
        System.out.print("Nota de "+ nome + " atualizada com sucesso!");
    }
    public void verificarAprovacao(){
        if (nota >=6){
            System.out.println(nome + " está aprovado(a).");
        }else {
            System.out.println(nome + " está reprovado(a).");
        }
    }

    @Override
    public String toString() {
        return "Alunos{" + "nome='" + nome + '\'' + ", idade=" + idade + ", nota=" + nota + '}';
    }
}
