package com.senai.Aula06_abstracao.exemplos_interface.Ex5_Controle_de_equipamento_inteligente;

public class LampadaInteligente implements AparelhosInteligentes{
    private int brilho;

    public LampadaInteligente() {
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lâmpada Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada Desligada");
    }

    public void aumentarBrilho(){
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho,1));
    }

    public void baixarBrilho(){
        System.out.printf("Brilho %d\n", brilho = ajusteNivel(brilho,-1));
    }

}
