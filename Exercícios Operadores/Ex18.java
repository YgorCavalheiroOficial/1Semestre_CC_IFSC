import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        int diaNascimento, mesNascimento, anoNascimento;
        int diaAtual, mesAtual, anoAtual;
        int totalDiasVividos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data de nascimento:");
        System.out.print("Dia: ");

        diaNascimento = scanner.nextInt();
        System.out.print("Mês: ");
        mesNascimento = scanner.nextInt();

        System.out.print("Ano: ");
        anoNascimento = scanner.nextInt();

        System.out.println("\nDigite a data atual:");
        System.out.print("Dia: ");
        diaAtual = scanner.nextInt();
        System.out.print("Mês: ");
        mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        anoAtual = scanner.nextInt();

        totalDiasVividos = (anoAtual - anoNascimento) * 360 + (mesAtual - mesNascimento) * 30 + (diaAtual - diaNascimento);

        System.out.println("\nTotal de dias vividos: " + totalDiasVividos + " dias");
    }
}