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

    public void setTaxaDeEntrega(double valorPedido) {
        double valorFinal = valorPedido + taxaDeEntrega;
        this.taxaDeEntrega = taxaDeEntrega;
    }

    @Override
    public void exibirPedido() {
        System.out.printf("Número do pedido: %d  Valor total: R$%,.2f  Taxa de entrega: %d \n" +
                getNumeroDoPedido(), getValorTotal(), getTaxaDeEntrega());
    }
}
