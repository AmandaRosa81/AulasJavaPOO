package com.senai.Aula06_abstracao.exemplos_interface.Ex4_SmartWatch;

public class Main {
    public static void main(String[] args) {
       SmartWatch smartWatch = new SmartWatch();

       smartWatch.exibirInfoDispositivos();
       smartWatch.medirFrequenciaCardiaca();
       smartWatch.contarPassos();
       smartWatch.medirQualidadeDeSono();
    }
}
