package com.senai.Aula06_abstracao.exemplos_interface.Ex2_Veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BIII BIII");
    }
}
