package com.senai.Aula04_heranca.exercicio03;

public class PedidoPresencial extends Pedido {
    private int descontoParaPagamentoAVista;


    public PedidoPresencial(int numeroDoPedido, double valorTotal, int descontoParaPagamentoAVista) {
        super(numeroDoPedido, valorTotal);
        this.descontoParaPagamentoAVista = descontoParaPagamentoAVista;
    }

    public int getDescontoParaPagamentoAVista() {
        return descontoParaPagamentoAVista;
    }

    @Override
    public void exibirPedido() {
        System.out.println("Número do pedido: " + getNumeroDoPedido() + " Valor total: " +
                (getValorTotal() - (descontoParaPagamentoAVista/100)) +
                " Desconto para pagamentos à vista: " + getDescontoParaPagamentoAVista());
    }
}
