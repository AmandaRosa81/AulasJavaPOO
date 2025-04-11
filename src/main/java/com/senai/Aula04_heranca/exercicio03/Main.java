package com.senai.Aula04_heranca.exercicio03;

public class Main {
    public static void main(String[] args) {
        PedidoOnline pedidoOnline = new PedidoOnline(
                407261,
                59,
                8);
        PedidoPresencial pedidoPresencial = new PedidoPresencial(
                261483,
                35,
                10);

        pedidoOnline.exibirPedido();
        pedidoPresencial.exibirPedido();
    }
}
