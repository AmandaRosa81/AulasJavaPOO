package com.senai.Aula07_mvc.crud_usuario.Model;

public class Supervisor extends Usuario{
    private String area;

    public Supervisor(String nome, int id, String area) {
        super(nome, id);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Nome: %s, Area: %s",
                super.getId(), super.getNome(), area
        );
    }
}
