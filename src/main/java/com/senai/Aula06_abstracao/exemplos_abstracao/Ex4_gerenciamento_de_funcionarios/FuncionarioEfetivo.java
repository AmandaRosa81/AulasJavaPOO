package com.senai.Aula06_abstracao.exemplos_abstracao.Ex4_gerenciamento_de_funcionarios;

public class FuncionarioEfetivo extends Funcionario{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
        return salario += bonusMensal;
    }
}
