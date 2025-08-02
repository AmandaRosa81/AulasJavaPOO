package com.senai.Aula08_CleanCode.Exemplos;
    //Com erros
//public class Evitar_Aninhamento_Excessivo​ {
//    public boolean verificarPermissao(Usuario usuario){
//        if (usuario != null){
//            if (usuario.isAtivo()){
//                if (usuario.getPerfil().equals("ADMIN")){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

public boolean verificarPermissao(Usuario usuario){
    if (usuario == null || !usuario.isAtivo()){
        return false;
    }
    return usuario.getPerfil().equals("ADMIN");
}
