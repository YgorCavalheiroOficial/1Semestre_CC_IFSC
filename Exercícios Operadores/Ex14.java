import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        int numCandidatos;
        double notaPortugues, notaMatematica, notaConhecimentos, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de candidatos: ");
        numCandidatos = scanner.nextInt();

        for (int i = 1; i <= numCandidatos; i++) {
            System.out.println("\nCandidato " + i + ":");

            System.out.print("Nome do candidato: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Nota de Português: ");
            notaPortugues = scanner.nextDouble();

            System.out.print("Nota de Matemática: ");
            notaMatematica = scanner.nextDouble();

            System.out.print("Nota de Conhecimentos Gerais: ");
            notaConhecimentos = scanner.nextDouble();

            media = (notaPortugues + notaMatematica + notaConhecimentos) / 3.0;

            System.out.println("Notas do candidato:");
            System.out.println("Português: " + notaPortugues);
            System.out.println("Matemática: " + notaMatematica);
            System.out.println("Conhecimentos Gerais: " + notaConhecimentos);
            System.out.println("Média: " + media);

            if (media >= 7.0 && notaPortugues >= 5.0 && notaMatematica >= 5.0 && notaConhecimentos >= 5.0) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }
    }
}
