import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Metodos {

    public static void cadastrarAluno(){

        List<Aluno> alunos = new ArrayList<Aluno>();
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
    }

    public static void consultarAlunoPorMatricula(){


    }

    public static void listarAlunosAprovados(){

    }

    public static void listarAlunosreprovados(){

    }

    public static void listarAlunosEmRecuperacao(){

    }
}
