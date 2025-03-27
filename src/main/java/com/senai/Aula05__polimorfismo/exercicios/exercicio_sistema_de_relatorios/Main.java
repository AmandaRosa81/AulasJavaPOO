package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_relatorios;

public class Main {
    public static void main(String[] args) {
        gerar(new PDF("PDF- Portable Document Format"));
        gerar(new CSV("CSV- Certificado de Segurança Veicular"));
        gerar(new JSON("JSON- JavaScript Object Notation"));
    }
    public static void gerar(Relatorio relatorio){
        relatorio.gerar();
    }
}
