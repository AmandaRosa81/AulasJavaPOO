package com.senai.Aula03_encapsulamento.exemplo;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto da classe Carro
        Carro carro = new Carro();

        //Utilizando métodos públicos para modificar e acessar a variável privada
        carro.setVelocidade(100);//Define a velocidade para 100
        System.out.println("Velocidade atual: "+ carro.getVelocidade());

        //Testando uma velocidade inválida
        carro.setVelocidade(-20); // Isso mostrará uma mensagem de erro
        /*carro.velocidade = -20; // Agora funciona sem erro
        System.out.println(*Velocidade modificada diretamente: " + carro.velocidade);*/
        /**/ //Ctrl+shift+ "/"
    }
}
