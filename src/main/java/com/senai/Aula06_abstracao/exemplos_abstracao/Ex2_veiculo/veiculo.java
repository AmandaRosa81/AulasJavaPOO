package com.senai.Aula06_abstracao.exemplos_abstracao.Ex2_veiculo;

public abstract class veiculo {
    private int velocidade;

    public veiculo(){
        this.velocidade = 0;
    }

    public void acelerar(int incremento){
        velocidade += incremento;
        System.out.println(" vrummm, acelerando para a velocidade " + velocidade + "Km/h\n");
    }

    abstract void ligar();

}
