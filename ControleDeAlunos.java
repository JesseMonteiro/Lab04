import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Classe controller do sistema.
 *
 * @author Jesse Monteiro Ferreira - 118210282
 */
public class ControleDeAlunos {
    /**
     * ArrayList dos grupos de estudo armazenados
     */
    private ArrayList<GrupoDeEstudo> gruposDeEstudo;

    /**
     * ArrayLista com a lista de alunos que responderam perguntas
     */
    private ArrayList<String> perguntas;

    /**
     * ArrayList com os alunos cadastrados
     */
    private ArrayList<Aluno> alunos;

    /**
     * Instancia da funcionalidade Scanner
     */
    private Scanner read;




    /**
     * Construtor da classe
     */
    public ControleDeAlunos() {
        gruposDeEstudo = new ArrayList<GrupoDeEstudo>();
        perguntas = new ArrayList<String>();
        alunos = new ArrayList<Aluno>();
        read =  new Scanner(System.in);
    }


    /**
     * Função para exibir o menu a cada execução do programa
     */
    public void exibirMenu(){
        System.out.println("\n(C)adastrar Aluno\n" +
                "(E)xibir Aluno\n" +
                "(N)ovo Grupo\n" +
                "(A)locar Aluno no Grupo e Imprimir Grupos\n" +
                "(R)egistrar Aluno que Respondeu\n" +
                "(I)mprimir Alunos que Responderam\n" +
                "(O)ra, vamos fechar o programa!\n" +
                "\n" +
                "Opção>\n");
    }

    /**
     * Metodo de cadastro de aluno, verificando a existencia se já existe um aluno com a mesma matricula.
     */
    public void cadastrarAluno() {
        System.out.println("Matrícula: ");
        String matricula = read.nextLine();
        System.out.println("Nome: ");
        String nome = read.nextLine();
        System.out.println("Curso: ");
        String curso = read.nextLine();

        if (buscaAluno(matricula) == null) {
            Aluno aluno = new Aluno(matricula, nome, curso);
            alunos.add(aluno);
            System.out.println("CADASTRO REALIZADO!");
        } else {
            System.out.println("MATRÍCULA JÁ CADASTRADA!");
        }

    }

    /**
     * Metodo para imprimir uma representacao de aluno pela matricula que eh seu identificador unico.
     */
    public void consultarAluno(){
        System.out.println("Matrícula: ");
        String matricula = read.nextLine();

        if(buscaAluno(matricula) != null){
            System.out.println(buscaAluno(matricula).toString());
        }else{
            System.out.println("Aluno não cadastrado.");
        }

    }

    /**
     * Metodo para buscar o aluno pelo seu identificador unico e verificar sua existencia.
     *
     * @param matricula identificador unico
     * @return retorna o aluno que possui a matricula informada ou null em caso de não existencia
     */
    public Aluno buscaAluno(String matricula){
        for (Aluno aluno : alunos ) {
            if(aluno.getMatricula().equals(matricula)){
                return aluno;
            }
        }
        return null;
    }

    /**
     * Metodo para o cadastro de grupos de estudo, verificando se já está cadastrado na lista
     */
    public void cadastrarGrupo(){
        System.out.println("Grupo: ");
        String tema = read.nextLine();

        if (buscaGrupo(tema) == null) {
            GrupoDeEstudo grupoDeEstudo = new GrupoDeEstudo(tema);
            gruposDeEstudo.add(grupoDeEstudo);
            System.out.println("CADASTRO REALIZADO!");
        } else {
            System.out.println("GRUPO JÁ CADASTRADO!");
        }

    }

    /**
     * Metodo para bucar o grupo na lista e verificar sua existencia.
     *
     * @param tema identificador do grupo.
     * @return o grupo de estud ou null caso não existente.
     */
    public GrupoDeEstudo buscaGrupo(String tema){
        for (GrupoDeEstudo grupoDeEstudo : gruposDeEstudo) {
            if (grupoDeEstudo.getTema().toLowerCase().equals(tema.toLowerCase())){
                return grupoDeEstudo;
            }
        }
        return null;
    }


    /**
     * Metodo para alocar alunos em um grupo de estudo ou imprimir alunos em um grupo de estudo.
     * Verificando a existencia ou não do grupo ou aluno.
     */
    public void alocarOuImprimir() {
        System.out.println("(A)locar Aluno ou (I)mprimir Grupo? ");
        String op = read.nextLine().toLowerCase();
        if (op.equals("a")) {
            System.out.println("Matricula: ");
            String matricula = read.nextLine();
            System.out.println("Grupo: ");
            String grupo = read.nextLine();
            if(buscaAluno(matricula) == null){
                System.out.println("Aluno não cadastrado.");
            }
            if(buscaGrupo(grupo) == null){
                System.out.println("Grupo não cadastrado.");
            }
            if (buscaAluno(matricula) != null &&  buscaGrupo(grupo) != null){
                buscaGrupo(grupo).adicionaAluno(buscaAluno(matricula));
                System.out.println("ALUNO ALOCADO!");
            }

        } else if (op.equals("i")) {
            System.out.println("Grupo: ");
            String grupo = read.nextLine();
            if(buscaGrupo(grupo) == null) {
                System.out.println("Grupo não cadastrado");
            }else {
                System.out.println("Alunos do grupo " + grupo);
                for (Aluno aluno: buscaGrupo(grupo).getAlunos()) {
                    System.out.println("* " + aluno.toString());
                }
            }
        }
    }


    /**
     * Metodo para registrar os alunos que responderam perguntas em sala, verificando se o aluno existe.
     */
    public void registraAlunoRespondeu(){
        System.out.println("Matricula: ");
        String matricula = read.nextLine();

        if(buscaAluno(matricula) == null){
            System.out.println("Aluno não cadastrado.");
        }else{
            perguntas.add(buscaAluno(matricula).toStringPergunta());
            System.out.println("ALUNO REGISTRADO!");
        }
    }

    /**
     * Metodo para imprimir todos os alunos que responderam perguntas
     */
    public void imprimirAlunosResponderam(){
        int i = 0;
        System.out.println("Alunos:");
        for (String pergunta: perguntas) {
            i++;
            System.out.println(i + " - " + pergunta.toString());
        }
    }



}
