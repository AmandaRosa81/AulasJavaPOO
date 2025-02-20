package com.senai.Aula02_colecoes.exercícios;

import java.util.ArrayList;

public class Tarefa {
    String nomeDaTarefa;
    Boolean concluida;

    public Tarefa(String nomeDaTarefa, Boolean statusDeConclusao) {
        this.nomeDaTarefa = nomeDaTarefa;
        this.concluida = false;
    }

    public void adicionarNovaTarefa(){

    }
    public void listarTarefas(){

    }
    public void marcarTarefa(){

    }
    public void removerTarefa(){

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeDaTarefa='" + nomeDaTarefa + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
