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

    public void setDescontoParaPagamentoAVista(int descontoParaPagamentoAVista) {

        this.descontoParaPagamentoAVista = descontoParaPagamentoAVista;
    }

    @Override
    public void exibirPedido() {
        System.out.printf("Número do pedido: %d  Valor total: R$%,.2f  Desconto para pagamentos à vista: %d\n" +
                getNumeroDoPedido(), getValorTotal(), getDescontoParaPagamentoAVista());
    }
}
