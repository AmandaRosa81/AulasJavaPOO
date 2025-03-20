package com.senai.Aula04_heranca.exercicio01;

public class Eletronico extends Produto{
    private double voltagem;

    public Eletronico(String nome, double valor, double quantidade, double voltagem) {
        super(nome, valor, quantidade);
        if (voltagem >= 220){
            this.voltagem = voltagem;
            System.out.println("Seu eletrodoméstico consome mais energia! Recomenda-se usá-lo no 220");
        }else {
            System.out.println("Seu eletrodoméstico consome menos energia! Recomenda-se usá-lo no 110");
        }
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        if (voltagem >= 220){
            this.voltagem = voltagem;
            System.out.println("Seu eletronico consome mais energia! Recomenda-se usá-lo no 220");
        }else {
            System.out.println("Seu eletronico consome menos energia! Recomenda-se usá-lo no 110");
        }

    }

    public void exibirProduto(){
        System.out.printf("Nome: %s , Valor: R$%,.2f , Quantidade: %,.2f , Voltagem: %,.2f volts\n", getNome(), getValor(),
                getQuantidade(), getVoltagem());
    }
}
