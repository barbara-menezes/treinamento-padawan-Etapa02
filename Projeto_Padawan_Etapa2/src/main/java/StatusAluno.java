import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusAluno {

    APROVADO,
    RECUPERACAO_PROVA_1,
    RECUPERACAO_PROVA_2,
    REPROVADO;
}
