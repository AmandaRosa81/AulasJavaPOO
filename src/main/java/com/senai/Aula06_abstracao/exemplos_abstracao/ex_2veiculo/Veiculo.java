package com.senai.Aula06_abstracao.exemplos_abstracao.ex_2veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Acelerando para "+ velocidade + " Km/h");
    }

    abstract void ligar();
}
//tudo o que é static não muda,ela permanece na classe. Já a void ela permanece na instancia.
//interface não tem construtor.
