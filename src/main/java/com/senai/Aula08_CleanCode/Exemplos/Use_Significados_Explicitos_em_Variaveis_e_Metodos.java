package com.senai.Aula08_CleanCode.Exemplos;

public class Use_Significados_Explicitos_em_Variaveis_e_Metodos {
        //Com erros
//    public void p(int[] a){
//        int x = 0;
//        for (int i : a){
//            x += i;
//        }
//        System.out.println(x);
//    }
//}

    //Corrigido
public void imprimirSoma(int[] numeros){
    int somaTotal = calcularSoma(numeros);
    System.out.println("Soma total: " + somaTotal);
}

private int calcularSoma(int[] numeros){
    int soma = 0;
    for (int numero : numeros){
        soma += numero;
    }
    return soma;
}}

