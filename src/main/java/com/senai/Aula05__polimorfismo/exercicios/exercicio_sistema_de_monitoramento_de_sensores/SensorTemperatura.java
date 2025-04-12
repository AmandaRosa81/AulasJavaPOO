package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_monitoramento_de_sensores;

public class SensorTemperatura extends Sensor{
    private double temperatura;

    public SensorTemperatura(String id, double temperatura) {
        super(id);
        this.temperatura = temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String reportarValor() {
        return "Sensor de temperatura [" + id + "]: " + temperatura + "°C";
    }
}
