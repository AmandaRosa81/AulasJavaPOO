package com.senai.Aula04_heranca.exercicio04;

public class PacienteParticular extends Paciente {
    private double valorConsulta;

    public PacienteParticular(String nomeDoPaciente, int idade, double valorConsulta) {
        super(nomeDoPaciente, idade);
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public void exibirDados() {
        System.out.println("Paciente: " +  getNomeDoPaciente() + "\nNão faz parte do convênio!\nFavor cobrar o valor " +
                "da consulta sem desconto!\nValor:  " + getValorConsulta());
    }
}
