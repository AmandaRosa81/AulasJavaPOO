package com.senai.Aula01_Introducao_poo.exercicios;

public class Alunos {
    String nome;
    int idade;
    int nota;

    public Alunos(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes(){


    }
    public void atualizarNota(){


    }
    public void verificarAprovacao(){


    }

    @Override
    public String toString() {
        return "Alunos{" + "nome='" + nome + '\'' + ", idade=" + idade + ", nota=" + nota + '}';
    }
}
