import java.util.Scanner;
/**
 *  Classe main/sistema para executar o programa
 *
 * @author Jesse Monteiro Ferreira - 118210282
 */
public class Sistema {
    public static Scanner read =  new Scanner(System.in);;

    public static void main(String[] args){

        ControleDeAlunos controleDeAlunos = new ControleDeAlunos();
        while(true){
            controleDeAlunos.exibirMenu();
            String opcao = read.nextLine().toLowerCase();
            switch (opcao){
                case  "c" :
                    controleDeAlunos.cadastrarAluno();
                    break;
                case "e":
                    controleDeAlunos.consultarAluno();
                    break;
                case "n" :
                    controleDeAlunos.cadastrarGrupo();
                    break;
                case "a":
                    controleDeAlunos.alocarOuImprimir();
                    break;
                case "r":
                    controleDeAlunos.registraAlunoRespondeu();
                    break;
                case "i":
                    controleDeAlunos.imprimirAlunosResponderam();
                    break;
                case "o":
                    System.exit(0);
            }


        }

    }
}
