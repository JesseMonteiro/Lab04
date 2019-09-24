import java.util.ArrayList;
/**
 *  Classe que represeneta um grupo de estudo
 *
 * @author Jesse Monteiro Ferreira - 118210282
 */
public class GrupoDeEstudo {
    /**
     * ArrayList de alunos cadastrados no grupo de estudo.
     */
    private ArrayList<Aluno> alunos;

    /**
     * Tema estudo no grupo e identificador
     */
    private String tema;


    /**
     * Construtor de grupo de estudo instanciando seu atributos.
     *
     * @param tema tema de estudo e identificador unico
     */
    public GrupoDeEstudo(String tema){
        if (tema == null || tema.equals("")){
            throw new IllegalArgumentException("Tema Vazio ou Nulo");
        }
        alunos = new ArrayList<Aluno>();
        this.tema = tema;
    }

    /**
     * Metodo para adicionar um novo aluno ao grupo
     *
     * @param aluno aluno a ser adicionado
     */
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }


    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }

    public String getTema(){
        return tema;
    }



}

