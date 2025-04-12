package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_beneficio_de_funcionarios;

public class auxilioTransporte extends Beneficio{
    public auxilioTransporte(String nome) {
        super("Auxilio transporte");
    }

    @Override
    public double calcularDesconto(double salario) {
        double desconto = salario*0.06;
        double limite = 180.0;

        if (desconto > limite){
            return limite;
        }else {
            return desconto;
        }
    }
}
