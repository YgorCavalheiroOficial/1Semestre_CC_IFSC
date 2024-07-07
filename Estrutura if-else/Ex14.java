import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        char genero;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a altura (em metros):");
        altura = in.nextDouble();

        System.out.println("Digite o gênero (M para masculino, F para feminino):");
        genero = in.next().charAt(0);

        if (genero == 'M') {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("O peso ideal para um homem de altura " + altura + "m é: " + pesoIdeal + "kg");
        } else if (genero == 'F') {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("O peso ideal para uma mulher de altura " + altura + "m é: " + pesoIdeal + "kg");
        } else {
            System.out.println("Gênero inválido! Digite M para masculino ou F para feminino.");
        }
    }
}
