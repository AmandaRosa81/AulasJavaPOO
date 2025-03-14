package com.senai.Aula04_heranca.exemplo2_Sistema_de_cadastro_de_funcionarios;

public class Funcionarios {
    //Atributos
    private String nome;
    protected double salario;

    //Construtor
    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Metodos

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s , Salário: R$%,.2f\n",nome,salario);//Tanto para double quanto para floute, é f.
        //%s vai ficar a informação do atributo nome, e o %f vai ficar a informação do salário.
    }
}
