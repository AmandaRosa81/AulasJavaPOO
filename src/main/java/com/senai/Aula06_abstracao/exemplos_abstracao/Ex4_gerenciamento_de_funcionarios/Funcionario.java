package com.senai.Aula06_abstracao.exemplos_abstracao.Ex4_gerenciamento_de_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(int porcentagem){
        salario += (salario*porcentagem/100);
    }

    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("%s recebe R$%,.2f\n", nome, salario);
    }
}
