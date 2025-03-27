package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_reserva_de_hotel;

public class ReservaVip extends Reserva{
    private double valorSimples;
    private double valorBeneficios;

    public ReservaVip(String nome, double valorSimples, double valorBeneficios) {
        super(nome);
        this.valorSimples = valorSimples;
        this.valorBeneficios = valorBeneficios;
    }

    @Override
    public double calcularReserva() {
        return valorSimples+valorBeneficios;
    }
}
