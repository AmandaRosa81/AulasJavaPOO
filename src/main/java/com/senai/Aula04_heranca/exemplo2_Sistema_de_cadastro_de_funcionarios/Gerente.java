package com.senai.Aula04_heranca.exemplo2_Sistema_de_cadastro_de_funcionarios;

public class Gerente extends Funcionarios {
    private double bonus;

    public Gerente(String nome, Double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Double getSalario() {
        return super.getSalario();
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s , Salário: R$%,.2f\n",getNome(),(salario+bonus));
    }
}
