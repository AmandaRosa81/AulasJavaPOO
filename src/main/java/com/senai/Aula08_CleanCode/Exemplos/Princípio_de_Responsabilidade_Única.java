package com.senai.Aula08_CleanCode.Exemplos;

public class Princípio_de_Responsabilidade_Única {
    public void gerarRelatorio(){
        //Lógica para gerar os dados do relatório
        System.out.println("Relatório gerado");
    }

    public void salvarRelatorio(String caminho){
        //Lógica para salvar o relatório no disco
        System.out.println("Relatório salvo em: " + caminho);
    }

    public void enviarRelatorioPorEmail(String email){
        //Lógica para salvar o relatório por e-mail
        System.out.println("Relatório enviado para: " + email);
    }

    public class Relatorio{
        public void gerarRelatorio(){
            //Lógica para gerar os dados do relatório
            System.out.println("Relatório gerado.");
        }
    }

    public class relatorioPersistencia{
        public void salvarRelatorio(String caminho){
            //Lógica para salvar o relatório no disco
            System.out.println("Relatório salvo em: " + caminho);
        }
    }

    public class relatorioEmail{
        public void enviarRelatorioPorEmail(String email){

            System.out.println("Relatório enviado para: " + email);
        }
    }
}















