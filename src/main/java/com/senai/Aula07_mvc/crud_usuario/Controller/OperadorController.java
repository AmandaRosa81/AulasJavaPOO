package com.senai.Aula07_mvc.crud_usuario.Controller;

import com.senai.Aula07_mvc.crud_usuario.Model.Operador;
import com.senai.Aula07_mvc.crud_usuario.Model.OperadorDAO;

import java.util.List;

public class OperadorController {
    private OperadorDAO operadorDAO = new OperadorDAO();

    public List<Operador> listarOperadores(){
        return OperadorDAO.listar();
    }
    public boolean cadastrarOperador(Operador operador){
        if (operador != null){
            OperadorDAO.salvar(operador);
            return true;
        }
        return false;
    }
    public boolean atualizarOperador(Operador operador){
        if (operador != null){
            OperadorDAO.atualizar(operador);
            return true;
        }
        return false;
    }
    public boolean deletarOperador(int id){
        if (id >= 0){
            operadorDAO.deletar(id);
            return true;
        }
        return false;
    }
}
