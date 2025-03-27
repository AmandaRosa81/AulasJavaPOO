package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_relatorios;

public class Relatorio {
    private String tipoRelatorio;

    public Relatorio(String tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void gerar(){
        System.out.println("Relatorio gerado");
    }
}
