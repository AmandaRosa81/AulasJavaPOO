package com.senai.Aula04_herança.exemplo2_Sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Jamily", 3000.0);
        Gerente gerente = new Gerente("Bianca", 20000.0, 400);

       funcionario.exibirDados();
       gerente.exibirDados();
    }
}
