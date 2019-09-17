import java.util.ArrayList;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private ArrayList perguntas = new String[];

    public Aluno(String matricula, String nome, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

}
