import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GrupoDeEstudoTest {

    private GrupoDeEstudo grupoDeEstudo1;
    private GrupoDeEstudo grupoDeEstudo2;


    @BeforeEach

    public void criaGrupo() {

        grupoDeEstudo1 = new GrupoDeEstudo( "Colecoes");
        grupoDeEstudo2 = new GrupoDeEstudo( "Testes");
    }

    @Test

    public void temaVazio(){
        assertThrows(IllegalArgumentException.class, () -> new GrupoDeEstudo(""));
    }

    @Test
    public void adicionaAluno(){
        grupoDeEstudo1.adicionaAluno(new Aluno("1182", "Jesse", "cc"));
        grupoDeEstudo2.adicionaAluno(new Aluno("1183", "Jose", "cc"));
    }

}
