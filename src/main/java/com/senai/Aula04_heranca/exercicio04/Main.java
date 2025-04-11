package com.senai.Aula04_heranca.exercicio04;

public class Main {
    public static void main(String[] args) {
        PacienteConvenio pacienteConvenio = new PacienteConvenio(
                "Bianca",
                25,
                20);
        PacienteParticular pacienteParticular = new PacienteParticular(
                "Jamily",
                27,
                150);

        System.out.println("------------Paciente com Convênio------------");
        pacienteConvenio.exibirDados();
        System.out.println("-------------Paciente Particular--------------");
        pacienteParticular.exibirDados();
    }
}
