package com.senai.Aula08_CleanCode.Exemplos;

public class Funcoes_Pequenas_e_Bem_Definidas {
    //Com erros
//   public void processar(int[] numeros){
//       int soma = 0;
//       int maior = Integer.MIN_VALUE;
//
//       for (int n : numeros){
//           soma += n;
//           if (n > maior){
//               maior = n;
//           }
//       }
//
//       System.out.println("Soma: " + soma);
//       System.out.println("Maior número: " + maior);
//   }
//}


    //Corrigido
public void processar(int[] numeros){
    int soma = calcularSoma(numeros);
    int maior = encontrarMaior(numeros);

    exibirResultados(soma, maior);
}

private int calcularSoma(int[] numeros){
    int soma = 0;
    for (int n : numeros){
        soma += n;
    }
    return soma;
}

private int encontrarMaior(int[] numeros){
    int maior = Integer.MIN_VALUE;
    for (int n : numeros){
        if (n > maior){
            maior = n;
        }
    }
    return maior;
}

private void exibirResultados(int soma, int maior){
    System.out.println("Soma: " + soma);
    System.out.println("Maior número: " + maior);
}}










