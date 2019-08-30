import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Metodos {

    public static void cadastrarAluno(List<Aluno> alunos) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        alunos.add(aluno);

        System.out.println("Informe a turma do aluno: ");
        aluno.setTurma(scanner.nextLine());
        alunos.add(aluno);

        System.out.println("Informe a matricula do aluno: ");
        aluno.setMatricula(scanner.nextLong());
        alunos.add(aluno);

        System.out.println("Informe a nota da prova 1:  ");
        aluno.setNotaProva1(scanner.nextLong());
        alunos.add(aluno);

        System.out.println("Informe a nota da prova 2:  ");
        aluno.setNotaProva2(scanner.nextLong());
        alunos.add(aluno);

        System.out.println("Informe a nota da prova 3:  ");
        aluno.setNotaProva3(scanner.nextLong());
        alunos.add(aluno);

        System.out.println("Informe a nota de exercicios:  ");
        aluno.setNotaExercicos(scanner.nextLong());
        alunos.add(aluno);

        Long total = (aluno.getNotaProva1() + aluno.getNotaProva2() + aluno.getNotaProva3() + aluno.getNotaExercicos());

        if (total < 40)
            aluno.setStatus(StatusAluno.APROVADO);
        else if (total >= 40 && total <= 49)
            aluno.setStatus(StatusAluno.RECUPERACAO_PROVA_1);
        else if (total >= 50 && total <= 59)
            aluno.setStatus(StatusAluno.RECUPERACAO_PROVA_2);
        else if (total >= 60)
            aluno.setStatus(StatusAluno.REPROVADO);
    }

    public static void consultarAlunoPorMatricula(List<Aluno> alunos) {

        Scanner scanner = new Scanner(System.in);
        long matricula = 0;

        System.out.println("Informe a matricula do aluno para pesquisa: ");
        matricula = scanner.nextLong();

        for (Aluno a : alunos) {
            if (matricula == a.getMatricula()) {
                System.out.println(" nome: " +
                        a.getNome() + "\n turma: " +
                        a.getTurma() + "\n matricula: " +
                        a.getMatricula() + "\n prova1: " +
                        a.getNotaProva1() + "\n prova2: " +
                        a.getNotaProva2() + "\n prova3: " +
                        a.getNotaProva3() + "\n exercicios: " +
                        a.getNotaExercicos());
                break;
            }
        }
    }

    public static void listarAlunosAprovados(List<Aluno> alunos) {

    }

    public static void listarAlunosReprovados(List<Aluno> alunos) {

    }

    public static void listarAlunosEmRecuperacao(List<Aluno> alunos) {

    }

}
