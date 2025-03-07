package com.senai.Aula03_encapsulamento.Conta_bancaria_operacoes_simples;

class Conta_Bancaria {
    //Atributos
    private String titular;
    private double saldo;

    //Construtor
    public Conta_Bancaria(String titular, double saldo) { //Regra de negócio: o saldo inicial deve ser não-negativo
        this.titular = titular;
        if (saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("O saldo inicial não pode ser negativo.");
            System.out.println("O saldo inicial será exibido coomo R$0,0");
        }
    }

    //Métodos


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo(){ //Metodo getter para mostrar o saldo no Conta_Bancaria
        return saldo;
    }

    //Metodo publico para deposito
    public void depositar(double valor){
        if (valor > 0){//Verifica se o valor não será negativo
            saldo += valor; //Adiciona valor ao saldo
            System.out.println("Déposito de R$ "+ valor +" reais feito com sucesso! Para a conta do(a) titular "
                    + titular);
        }else {
            System.out.println("Erro! Valor de déposito inválido, deposite um valor maior que zero.");
        }
    }

    //Metodo publico para saque
    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){//Verifica se o valor vai ser menor que o saldo ou igual a ele.
            // Entretanto, o valor só pode ser maior que 0
            saldo -= valor; //Subtrai o valor
            System.out.println("Saque no valor de R$ "+ valor +" reais feito com sucesso! Para a conta do(a) titular "
                    + titular);
            return true;//Se a operação der certo, vai retornar true.
        }else {
            System.out.println("Saque no valor de "+ valor +" reais inválido, o saque deve ter um valor maior que zero");
            return false;//Se a operação der errado, vai retornar false.
        }
    }
    public boolean transferir(double valor, Conta_Bancaria contaDestino){
        if (this.sacar(valor));//Com o sacar tendo os retornos true e false, aqui no transferir ele so vai seguir para
        // a próxima linha se for true, se não ela nem roda e sai fora.
        contaDestino.depositar(valor);
        System.out.println("Transferencia realizada com sucesso!");
        return  false;
    }

    @Override
    public String toString() {
        return "Conta_Bancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
