import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusAluno {

    APROVADO("Aprovado"),
    RECUPERACAO_PROVA_1("Recupareção Prova 1"),
    RECUPERACAO_PROVA_2("Recuperação Prova 2"),
    REPROVADO("Reprovado");

    private String descricao;

    public static void main(String[] args) {
        for (StatusAluno statusAluno : StatusAluno.values()) {
            System.out.println(
                    statusAluno.ordinal() + " - " +
                    statusAluno.name() + " - " +
                    statusAluno.getDescricao()
            );
        }
    }

}
