package com.senai.Aula04_heranca.exercicio03;

public class Pedido {
    private int numeroDoPedido;
    protected double valorTotal;

    public Pedido(int numeroDoPedido, double valorTotal) {
        this.numeroDoPedido = numeroDoPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirPedido(){
        System.out.printf("Número do pedido: " + getNumeroDoPedido() + "Valor total: " + getValorTotal());
    }
}
