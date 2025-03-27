package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_reserva_de_hotel;

public class ReservaSimples extends Reserva{
    private double valorComum;

    public ReservaSimples(String nome, double valorComum) {
        super(nome);
        this.valorComum = valorComum;
    }

    @Override
    public double calcularReserva() {
        return valorComum;
    }
}
