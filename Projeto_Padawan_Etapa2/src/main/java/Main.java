import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 0;

        System.out.println("Digite a opcao que voce deseja: ");
        opcao = scanner.nextInt();

        do {
            switch (opcao) {
                case 1:
                    Metodos.cadastrarAluno();
                    break;
                case 2:
                    Metodos.consultarAlunoPorMatricula();
                    break;
                case 3:
                    Metodos.listarAlunosAprovados();
                    break;
                case 4:
                    Metodos.listarAlunosEmRecuperacao();
                    break;
                case 5:
                    Metodos.listarAlunosreprovados();
                    break;
                default:
            }
        } while (opcao != 5);
    }
}
