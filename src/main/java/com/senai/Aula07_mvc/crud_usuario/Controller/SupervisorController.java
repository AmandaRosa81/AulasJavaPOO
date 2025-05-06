package com.senai.Aula07_mvc.crud_usuario.Controller;

import com.senai.Aula07_mvc.crud_usuario.Model.Operador;
import com.senai.Aula07_mvc.crud_usuario.Model.OperadorDAO;
import com.senai.Aula07_mvc.crud_usuario.Model.Supervisor;
import com.senai.Aula07_mvc.crud_usuario.Model.SupervisorDAO;

import java.util.List;

public class SupervisorController{
    private SupervisorDAO supervisorDAO = new SupervisorDAO();

    public List<Supervisor>  listarSuperiores(){
        return SupervisorDAO.listar();
    }
    public boolean cadastrarSupervisor(Supervisor supervisor){
        if (supervisor != null){
            SupervisorDAO.salvar(supervisor);
            return true;
        }
        return false;
    }
    public boolean atualizarSupervisor(Supervisor supervisor){
        if (supervisor  != null){
            SupervisorDAO.atualizar(supervisor );
            return true;
        }
        return false;
    }
}
