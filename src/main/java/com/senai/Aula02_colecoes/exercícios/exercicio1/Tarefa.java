package com.senai.Aula02_colecoes.exercícios.exercicio1;

public class
Tarefa {
    String nomeDaTarefa;
    Boolean concluida;

    public Tarefa(String nomeDaTarefa, Boolean concluida) {
        this.nomeDaTarefa = nomeDaTarefa;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeDaTarefa='" + nomeDaTarefa + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
