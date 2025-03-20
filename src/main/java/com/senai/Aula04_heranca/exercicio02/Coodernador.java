package com.senai.Aula04_heranca.exercicio02;

public class Coodernador extends Funcionario {
    private String equipeDeProfessores;

    public Coodernador(String nome, double salario, int idCargo, String equipeDeProfessores) {
        super(nome, salario, idCargo);
        this.equipeDeProfessores = equipeDeProfessores;
    }

    public String getEquipeDeProfessores() {
        return equipeDeProfessores;
    }

    public void setEquipeDeProfessores(String equipeDeProfessores) {
        this.equipeDeProfessores = equipeDeProfessores;
    }
}
