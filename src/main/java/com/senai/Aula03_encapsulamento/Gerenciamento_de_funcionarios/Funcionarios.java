package com.senai.Aula03_encapsulamento.Gerenciamento_de_funcionarios;

public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaDeCargos = {"Gerente", "Analista" , "Programador"};

    public Funcionarios(String nome, double salario, int idCargo) {
        if (!nome.isBlank()) { //isBlank serve para colocar como obrigátorio o preenchimento do dado
            this.nome = nome;
        }else {
            System.out.println("Obrigátirio o prenchimento da informação!");
            System.out.println("O campo será atribuído como anônimo");
            this.nome="Anônimo";
        }
        if (salario >= 1320){
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser maior que R$1.320");
            System.out.println("O campo salário será preenchido com R$1.320");
            this.salario = 1320;
        }
        if (idCargo >= 1 && idCargo <= listaDeCargos.length){//Aqui o idCargo precisa ser maior que 1 ou igual a 1,
            // pois tem 3 opções de cargo.
            //Já no idCargo <= a lista ele vai estar indicando, que ele terá que começar desde 0 até o 2.
            this.cargo = listaDeCargos[idCargo-1];
            System.out.println();
        }else {
            System.out.println("Cargo inválido!");
            System.out.println("O campo cargo será atribuído  como 'Programador'");
            this.cargo = listaDeCargos[2];
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1320){
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser maior que R$1.320");
        }
    }
    public void aumentarSalario(int porcentagemAumento){
        if (porcentagemAumento>0) { //A porcentagem não pode ser menor que zero.
            this.salario += (salario * porcentagemAumento) / 100;
            System.out.println("Aumento do salário do funcionário "+ nome + " realizado com sucesso.\nValor atualizado"
                    + " do slário é "+ salario);
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
