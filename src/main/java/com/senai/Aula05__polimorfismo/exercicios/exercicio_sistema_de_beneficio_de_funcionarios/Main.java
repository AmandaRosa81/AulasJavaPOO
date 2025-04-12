package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_beneficio_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        double salario = 1500.00;

        Beneficio valeAlimentacao = new valeAlimentacao("Amanda");
        Beneficio planoDeSaude = new PlanoDeSaude("Bianca");
        Beneficio auxilioTransporte = new auxilioTransporte("Jamily");

        double descontoVA = valeAlimentacao.calcularDesconto(salario);
        double descontoPS = planoDeSaude.calcularDesconto(salario);
        double descontoAT = auxilioTransporte.calcularDesconto(salario);

        System.out.printf("Salário bruto: R$%.2f%n", salario);
        System.out.printf("%s: R$%.2f%n", valeAlimentacao.getNome(), descontoVA);
        System.out.printf("%s: R$%.2f%n", planoDeSaude.getNome(), descontoPS);
        System.out.printf("%s: R$%.2f%n", auxilioTransporte.getNome(), descontoAT);
    }
}
