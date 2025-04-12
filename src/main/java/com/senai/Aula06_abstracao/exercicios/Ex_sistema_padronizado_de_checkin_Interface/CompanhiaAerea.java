package com.senai.Aula06_abstracao.exercicios.Ex_sistema_padronizado_de_checkin_Interface;

public interface CompanhiaAerea {
    int PESO_MAXIMO_BAGAGEM_INTERNACIONAL = 32; //Constante
    int PESO_MAXIMO_BAGAGEM_NACIONAL = 23;

    //Contrato padrão
    void validarDoumento();
    void emitirCartao();

    //Mensagem padrão
    default void mensagemPadrao(){
        System.out.println("Check-in seguro realizado pela FlySecure.");
    }

    //Metodo static
    static void mensagemBemVindo(){
        System.out.println("Bem-vindo ao aplicativo da FlySecure!");
    }

    //Metodo interno (privado)
    private boolean validarDados(int dados) {
        if (dados == dados) {
            return true;
        }else {
            return false;
        }
    }
}
