package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_monitoramento_de_sensores;

public class Sensorumidade extends Sensor{
    private double umidade;

    public Sensorumidade(String id, double umidade) {
        super(id);
        this.umidade = umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    @Override
    public String reportarValor() {
        return "Sensor de Umidade [" + id + "]: " + umidade + "% de umidade";
    }
}
