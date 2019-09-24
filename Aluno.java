import java.util.Objects;

/**
 *  Classe que representa um aluno
 *
 * @author Jesse Monteiro Ferreira - 118210282
 */
public class Aluno {
    /**
     * Matricula e identificador unico do aluno.
     */
    private String matricula;

    /**
     * Nome do aluno
     */
    private String nome;

    /**
     * Curso do aluno
     */
    private String curso;

    /**
     * Construtor de aluno.
     *
     * @param matricula matricula e identificador unico do aluno.
     * @param nome nome do aluno.
     * @param curso curso do aluno.
     */
    public Aluno(String matricula, String nome, String curso){
        if(matricula == null || matricula.equals("")){
            throw new IllegalArgumentException("Matricula Vazia ou Nulo");
        }
        if(nome == null || nome.equals("")){
            throw new IllegalArgumentException("Nome Vazio ou Nulo");
        }
        if(curso == null || curso.equals("")){
            throw new IllegalArgumentException("Curso Vazio ou Nulo");
        }
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }


    /**
     * Representacao textual do aluno.
     *
     * @return representacao textual.
     */
    @Override
    public String toString() {
        return "Aluno: " + matricula + " - "  + nome + " - " + curso;
    }

    /**
     * Representacao textual do aluno formatada para exibir em perguntas.
     *
     * @return representacao textual do aluno para perguntas
     */
    public String toStringPergunta() {
        return matricula + " - "  + nome + " - " + curso;
    }


    /**
     *  Alteracao do equals para verificar o aluno pela matricula que é seu identificador unico.
     *
     * @param o aluno a ser comparado.
     * @return se eh igual ou nao.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno){
            Aluno aluno = (Aluno) o;
            aluno.getMatricula().equals(this.matricula);
            return true;
        }
        return false;

    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(matricula, nome, curso);
//    }

    public String getMatricula() {
        return matricula;
    }
}
