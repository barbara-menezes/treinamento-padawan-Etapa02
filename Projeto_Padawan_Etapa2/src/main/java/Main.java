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
            System.out.println("\n1 - Cadastrar novo aluno");
            System.out.println("\n2 - Consultar aluno por matricula");
            System.out.println("\n3 - Listar alunos aprovados ");
            System.out.println("\n4 - Listar alunos reprovados");
            System.out.println("\n5 - Listar alunos de recuperação");
            System.out.println("\n6 - Sair");

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
