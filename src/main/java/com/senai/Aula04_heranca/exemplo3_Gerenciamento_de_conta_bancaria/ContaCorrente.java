package com.senai.Aula04_heranca.exemplo3_Gerenciamento_de_conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if (valor <= (saldo+limite) && valor > 0){
            saldo -= valor;
            System.out.println("Saque no valor de R$ "+ valor +" realizado com sucesso para a conta de "+ getTitular() +
                    ". Saldo atualizado: R$ "+ saldo);
            return true;
        }else if (valor > saldo){
            System.out.println("Erro! Saldo insuficiente para realizar o saque!");
            return false;
        }else {
            System.out.println("Erro! O valor do saque deve ser positivo!");
            return false;
        }
    }
}
