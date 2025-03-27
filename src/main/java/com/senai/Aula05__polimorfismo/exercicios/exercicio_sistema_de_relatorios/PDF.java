package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_relatorios;

public class PDF extends Relatorio{
    public PDF(String tipoRelatorio) {
        super(tipoRelatorio);
    }

    @Override
    public void gerar() {
        System.out.printf("Relatorio do tipo %s gerado com sucesso!!!\n", getTipoRelatorio());
    }
}
