package com.senai.Aula03_encapsulamento.exemplos;

//Definição de classe Carro
class Carro {

    //Atributo privado: só pode ser acessado dentro da própria classe
    private int velocidade;

    //Construtor da classe
    public Carro(){
        velocidade = 0; //Inicialmente o carro está parado
    }

    //Metodo publico para obter a velocidade (Getter)
    public int getVelocidade(){
        return velocidade;
    }
    //Metodo publico para definir a velocidade (Setter)
    public void setVelocidade(int velocidade){
            if (velocidade >= 0){//Regra de negócio: velocidade não pode ser negativa
                this.velocidade = velocidade;
        }else {
            System.out.println("Velocidade inválida!");
        }
    }
}
