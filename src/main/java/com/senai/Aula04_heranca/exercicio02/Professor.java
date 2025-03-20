package com.senai.Aula04_heranca.exercicio02;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, int idCargo, String disciplina) {
        super(nome, salario, idCargo);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
