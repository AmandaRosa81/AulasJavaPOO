package com.senai.Aula06_abstracao.exemplos_interface.Ex4_SmartWatch;

public class SmartWatch implements SensorCardioco, SensorPassos, SensorSono{


    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiáca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 4500 passos");
    }

    @Override
    public void medirQualidadeDeSono() {
        System.out.println("Qualidade do sono: 7h30m sono profundo");
    }

    public void exibirInfoDispositivos(){
        System.out.println("Dispositivos conectados...");
    }

}
