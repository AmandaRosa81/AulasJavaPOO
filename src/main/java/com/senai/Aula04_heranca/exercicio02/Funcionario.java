package com.senai.Aula04_heranca.exercicio02;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaDeCargos = {"Coodernador", "Professor"};

    public Funcionario(String nome, double salario, int idCargo) {
        this.nome = nome;
        if (salario >= 1500) {
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser maior que R$1.500");
            this.salario = 1500;
        }
        if (idCargo >= 1 && idCargo <= listaDeCargos.length){
            this.cargo = listaDeCargos[idCargo-1];
        }else {
            System.out.println("Cargo inválido!");
            this.cargo = listaDeCargos[2];
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1500) {
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser maior que R$1.500");
            this.salario = 1500;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirFuncionario(){
        System.out.printf(" Nome:  %s , Salario: R$%,.2f, Cargo:  %s\n", getNome(), getSalario(), getCargo());
        //Especificadores: %s para String, %d para Inteiro, %f para Double ou Floute.
    }

}
