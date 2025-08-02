package com.senai.Aula08_CleanCode.Exemplos;

public class Evitar_Código_Duplicado {
    //Com erros
    public void calcularSalarioMensal(){
        double salarioBase = 3000.0;
        double bonus = 500.0;
        double salarioTotal = salarioBase + bonus;
        System.out.println("Salário Mensal: " + salarioTotal);
    }

    //Corrigido
    public void calcularSalarioAnual(){
        double salarioBase =3000.0;
        double bonus = 500.0;
        double salarioMensal = salarioBase + bonus;
        double salarioAnual = salarioMensal * 12;
        System.out.println("Salário Anual: " + salarioAnual);
    }
}
