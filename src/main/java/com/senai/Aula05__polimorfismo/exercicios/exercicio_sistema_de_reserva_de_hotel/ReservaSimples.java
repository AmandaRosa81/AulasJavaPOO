package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_reserva_de_hotel;

public class ReservaSimples extends Reserva{
    private int dias;
    private double valorDiaria;

    public ReservaSimples(String nome, int dias, double valorDiaria) {
        super(nome);
        this.dias = dias;
        this.valorDiaria = valorDiaria;
    }

    @Override
    public double calcularReserva() {
        return valorDiaria*dias;
    }
}
