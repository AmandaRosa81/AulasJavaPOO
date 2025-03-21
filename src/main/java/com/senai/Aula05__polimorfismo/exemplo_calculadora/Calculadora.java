package com.senai.Aula05__polimorfismo.exemplo_calculadora;

public class Calculadora {
    int somar(int a, int b){
        System.out.println("int, int");
        return a+b;
    }
    int somar(int a, int b, int c){
        System.out.println("int, int, int");
        return a+b+c;
    }
    double somar(double a, double b){
        System.out.println("double, double");
        return a+b;
    }
    double somar(int a, double b){//double aceita int dentro dele, mas int não aceita double dentro dele por ser muito
        // maior que int.
        System.out.println("int, double");
        return a+b;
    }
    double somar(double b, int a){
        System.out.println("double, int");
        return a+b;
    }
}
