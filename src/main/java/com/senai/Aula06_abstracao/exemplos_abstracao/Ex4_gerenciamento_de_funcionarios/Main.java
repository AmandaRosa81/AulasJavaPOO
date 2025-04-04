package com.senai.Aula06_abstracao.exemplos_abstracao.Ex4_gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testarPagamento(new FuncionarioEfetivo("Jamily",1000, 10));
        testarPagamento(new FuncionarioTemporario("Bianca", 1000, 200, 100));
    }
    public static void testarPagamento(Funcionario funcionario){
        System.out.println("-------testando funcionários-------\n");
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
