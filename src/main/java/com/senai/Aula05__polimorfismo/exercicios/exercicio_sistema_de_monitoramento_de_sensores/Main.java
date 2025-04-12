package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_monitoramento_de_sensores;

public class Main {
    public static void main(String[] args) {
        Sensor tempSensor = new SensorTemperatura("0041", 23.5);
        Sensor umidSensor = new Sensorumidade("0052", 60.0);

        System.out.println(tempSensor.reportarValor());
        System.out.println(umidSensor.reportarValor());
    }
}
