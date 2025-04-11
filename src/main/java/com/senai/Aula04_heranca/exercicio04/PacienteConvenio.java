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
        System.out.println("Nome do paciente: " + getNomeDoPaciente() + "\nIdade do paciente: " + getIdade() +
                "\nCarregando dados..." + "\nResultado: Paciente conveniado!\nApto á usufruir dos benefícios do " +
                "convênio!\nValor de desconto: "
                + getValorDesconto() + "%");
    }
}
