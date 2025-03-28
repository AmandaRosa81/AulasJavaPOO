package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_reserva_de_hotel;

public class ReservaVip extends Reserva{
    private double valorDiaria;
    private double valorBeneficios;


    public ReservaVip(String nome, double valorDiaria, double valorBeneficios) {
        super(nome);
        this.valorDiaria = valorDiaria;
        this.valorBeneficios = valorBeneficios;
    }

    @Override
    public double calcularReserva() {
        return valorDiaria+valorBeneficios;
    }
}
