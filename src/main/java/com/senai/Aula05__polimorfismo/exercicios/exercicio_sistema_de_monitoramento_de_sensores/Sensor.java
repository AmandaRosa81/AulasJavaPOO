package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_monitoramento_de_sensores;

public abstract class Sensor {
    protected String id;

    public Sensor(String id) {
        this.id = id;
    }

    public abstract String reportarValor();
}
