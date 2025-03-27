package com.senai.Aula05__polimorfismo.exemplo_gestao_de_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro(": City"));
        realizarManutencao(new Moto(": Factor"));
        realizarManutencao(new Caminhao(": Scania 1659"));
    }
    public static void realizarManutencao(Veiculo veiculo) {
        veiculo.realizarManutencao();
    }
}
