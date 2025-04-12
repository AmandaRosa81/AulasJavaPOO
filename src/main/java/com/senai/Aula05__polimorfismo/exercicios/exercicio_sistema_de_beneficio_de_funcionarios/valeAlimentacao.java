package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_beneficio_de_funcionarios;

public class valeAlimentacao extends Beneficio{
    public valeAlimentacao(String nome) {
        super("Vale Alimentação");
    }

    @Override
    public double calcularDesconto(double salario) {
        return 150.0;
    }
}
