package com.senai.Aula04_heranca.exercicio04;

public class PacienteConvenio extends Paciente {
    private double valorDesconto;

    public PacienteConvenio(String nomeDoPaciente, int idade, double valorDesconto) {
        super(nomeDoPaciente, idade);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome do paciente: " + getNomeDoPaciente() + " idade do paciente: " + getIdade() +
                "...Resultado: Paciente conveniado! Apto á usufruir dos benefícios do convênio! Valor de desconto: "
                + getValorDesconto());
    }
}
