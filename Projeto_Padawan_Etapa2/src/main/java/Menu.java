import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Menu {

    CADASTRAR("Cadastrar novo aluno"),
    CONSULTAR("Consultar aluno por matricula"),
    LISTAR_APROVADOS("Listar alunos aprovados"),
    LISTAR_REPROVADOS("Listar alunos reprovados"),
    LISTAR_RECUPERACAO("Listar alunos de recuperação"),
    SAIR("Sair");

    private String descriicao;
}
