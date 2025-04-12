package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_beneficio_de_funcionarios;

public class PlanoDeSaude extends Beneficio{
    public PlanoDeSaude(String nome) {
        super("Plano de Saúde");
    }

    @Override
    public double calcularDesconto(double salario) {
        return salario*0.08;
    }
}
