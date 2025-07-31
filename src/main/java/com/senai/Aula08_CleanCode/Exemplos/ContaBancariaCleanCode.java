package com.senai.Aula08_CleanCode.Exemplos;

public class ContaBancariaCleanCode {
    private String titularDaConta;
    protected double saldoDaContaBancaria;

    public ContaBancariaCleanCode(String titularDaConta, double saldoDaContaBancaria) {
        this.titularDaConta = titularDaConta;
        if (saldoDaContaBancaria >= 0){
            this.saldoDaContaBancaria = saldoDaContaBancaria;
        }else {
            System.out.println("O saldo inicial não pode ser negativo.");
            System.out.println("O saldo da conta iniciará em R$0.0");
        }
    }

    public String getTitular() {
        return titularDaConta;
    }

    public void setTitular(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldoDaContaBancaria;
    }

    public void depositar(double valorDoDeposito){
        if (valorDoDeposito > 0){
            saldoDaContaBancaria+= valorDoDeposito;
            System.out.println("Deposito no valor de R$ " + valorDoDeposito + " realizado com sucesso, para a conta do titular "
                    + titularDaConta + ". Saldo atualizado: R$" + saldoDaContaBancaria);
        }else {
            System.out.println("Erro! deposito realizado para o titular "+ titularDaConta +": O valor do depósito precisa" +
                    " ser positivo ou maior que 0.");
        }
    }

    public boolean sacar (double valorSacado){
        if (valorSacado <= saldoDaContaBancaria && valorSacado > 0){
            saldoDaContaBancaria -= valorSacado;
            System.out.println("Saque no valor de R$ "+ valorSacado +" realizado com sucesso do(a) titular "+ titularDaConta +
                    ".\nSaldo atualizado: R$ "+ saldoDaContaBancaria);
            return true;
        }else if (valorSacado > saldoDaContaBancaria){
            System.out.println("Erro! Saldo insuficiente para realizar o saque!");
            return false;
        }else {
            System.out.println("Erro! O valor do saque deve ser positivo!");
            return false;
        }
    }

    public void exibirSaldo(){
        System.out.printf("Nome: %s , Salário: R$%,.2f\n",titularDaConta, saldoDaContaBancaria);
    }

}
