package com.senai.Aula05__polimorfismo.exercicios.exercicio_sistema_de_reserva_de_hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Reserva> listaReserva = new ArrayList<>();
            listaReserva.add(new ReservaSimples("Reserva Simples", 5, 400));
            listaReserva.add(new ReservaVip("Reserva VIP", 400, 500));

        listaReserva.forEach(reserva ->
                System.out.printf("O custo total da %s em %d dias é R$R$%,.2f\n",
                reserva.getNome(),
                reserva.calcularReserva()
                )
        );
    }
}
