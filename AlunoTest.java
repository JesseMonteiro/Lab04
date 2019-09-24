import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    @BeforeEach

    public void criaAluno() {

        aluno1 = new Aluno( "118210" , "Jesse  Monteiro",  "Ciencia da Computacao");
        aluno2 = new Aluno( "118211" , "Lucas Marlon",  "Ciencia da Computacao");
        aluno3 = new Aluno( "118212" , "Joao da Silva",  "Engenharia Eletrica");


    }

    @Test

    public void testaMatriculaVazio(){
        assertThrows(IllegalArgumentException.class, () -> new Aluno("1182", "", "Ciencia da Computacao"));
    }

    @Test

    public void testaNomeVazio(){
        assertThrows(IllegalArgumentException.class, () -> new Aluno("", "Jose Silva", "2100-0000"));
    }

    @Test

    public void testaCursoVazio(){
        assertThrows(IllegalArgumentException.class, () ->  new Aluno("1182", "Jose", ""));
    }


}
