package com.senai.Aula02_colecoes.exercícios.exercicio1;

public class Tarefa {
    protected String nomeDaTarefa;
    protected Boolean concluida;

    public Tarefa(String nomeDaTarefa) {
        this.nomeDaTarefa = nomeDaTarefa;
        this.concluida = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeDaTarefa='" + nomeDaTarefa + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
