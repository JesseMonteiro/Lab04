import java.util.ArrayList;

public class ControledeAlunos {
    private ArrayList GruposdeEstudo = new GrupodeEstudo();


    public ControledeAlunos(){

    }

    public void exibirMenu(){
        System.out.println("(C)adastrar Aluno\n" +
                "(E)xibir Aluno\n" +
                "(N)ovo Grupo\n" +
                "(A)locar Aluno no Grupo e Imprimir Grupos\n" +
                "(R)egistrar Aluno que Respondeu\n" +
                "(I)mprimir Alunos que Responderam\n" +
                "(O)ra, vamos fechar o programa!\n" +
                "\n" +
                "Opção>\n");
    }
}
