package com.senai.Aula05__polimorfismo.exemplo_gestao_de_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    }//Metodo polimófico
}
