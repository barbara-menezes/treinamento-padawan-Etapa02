import lombok.*;

@Data
@AllArgsConstructor
public class Aluno {

    private String nome;
    private String turma;
    private Long matricula;
    private Long notaProva1;
    private Long notaProva2;
    private Long notaProva3;
    private Long notaExercicos;
    private StatusAluno status;

    public Aluno() {

    }
}
