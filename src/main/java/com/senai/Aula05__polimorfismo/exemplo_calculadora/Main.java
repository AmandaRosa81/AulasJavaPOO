package com.senai.Aula05__polimorfismo.exemplo_calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(5,6);
        calculadora.somar(2,5,9);
        calculadora.somar(6.3, 9.3);
        calculadora.somar(1,6.4);
        calculadora.somar(7.2, 3);
    }
}
