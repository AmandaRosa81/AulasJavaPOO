package com.senai.Aula04_heranca.exercicio04;

public class Paciente {
    private String nomeDoPaciente;
    private int idade;

    public Paciente(String nomeDoPaciente, int idade) {
        this.nomeDoPaciente = nomeDoPaciente;
        this.idade = idade;
    }

    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDados(){
        System.out.println("Nome do paciente: "+ getNomeDoPaciente()+" idade do paciente: "+ getIdade());
    }
}
