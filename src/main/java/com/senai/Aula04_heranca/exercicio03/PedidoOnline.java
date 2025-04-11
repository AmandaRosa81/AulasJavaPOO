package com.senai.Aula04_heranca.exercicio03;

public class PedidoOnline extends Pedido{
    private int taxaDeEntrega;

    public PedidoOnline(int numeroDoPedido, double valorTotal, int taxaDeEntrega) {
        super(numeroDoPedido, valorTotal);
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public int getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    @Override
    public void exibirPedido() {
        System.out.println("Número do pedido: " + getNumeroDoPedido() + " Valor total: " +
                (getValorTotal() + taxaDeEntrega) + " Taxa de entrega: " + getTaxaDeEntrega());

    }
}
