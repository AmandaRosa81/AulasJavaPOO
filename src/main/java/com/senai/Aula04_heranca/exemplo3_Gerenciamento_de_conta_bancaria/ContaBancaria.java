package com.senai.Aula04_heranca.exemplo3_Gerenciamento_de_conta_bancaria;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("O saldo inicial não pode ser negativo.");
            System.out.println("O saldo da conta iniciará em R$0.0");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor){
        if (valor > 0){
            saldo+= valor;
            System.out.println("Deposito no valor de R$ " + valor + " realizado com sucesso, para a conta do titular "
                    + titular + ". Saldo atualizado: R$" + saldo);
        }else {
            System.out.println("Erro! deposito realizado para o titular "+ titular +": O valor do depósito precisa" +
                    " ser positivo ou maior que 0.");
        }
    }

    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Saque no valor de R$ "+ valor +" realizado com sucesso do(a) titular "+ titular +
                    ".\nSaldo atualizado: R$ "+ saldo);
            return true;
        }else if (valor > saldo){
            System.out.println("Erro! Saldo insuficiente para realizar o saque!");
            return false;
        }else {
            System.out.println("Erro! O valor do saque deve ser positivo!");
            return false;
        }
    }

    public void exibirSaldo(){
        System.out.printf("Nome: %s , Salário: R$%,.2f\n",titular, saldo);
    }

}
