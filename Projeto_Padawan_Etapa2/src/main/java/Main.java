import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 0;
        List<Aluno> alunos = new ArrayList<Aluno>();

        do {
            System.out.println("\nDigite a opcao que voce deseja: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Metodos.cadastrarAluno(alunos);
                    break;
                case 2:
                    Metodos.consultarAlunoPorMatricula(alunos);
                    break;
                case 3:
                    Metodos.listarAlunosAprovados(alunos);
                    break;
                case 4:
                    Metodos.listarAlunosEmRecuperacao(alunos);
                    break;
                case 5:
                    Metodos.listarAlunosReprovados(alunos);
                    break;
                default:
            }
        } while (opcao != 5);
    }
}
