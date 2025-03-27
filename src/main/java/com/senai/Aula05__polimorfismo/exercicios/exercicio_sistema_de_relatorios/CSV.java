package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_relatorios;

public class CSV extends Relatorio{
    public CSV(String tipoRelatorio) {
        super(tipoRelatorio);
    }

    @Override
    public void gerar() {
        System.out.printf("Relatorio do tipo %s gerado com sucesso!!!\n", getTipoRelatorio());
    }
}
