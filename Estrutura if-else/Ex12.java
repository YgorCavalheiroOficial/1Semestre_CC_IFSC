import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        double angulo;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do ângulo:");
        angulo = in.nextDouble();

        if (angulo < 90) {
            System.out.println("O ângulo é agudo.");
        } else if (angulo == 90) {
            System.out.println("O ângulo é reto.");
        } else {
            System.out.println("O ângulo é obtuso.");
        }
    }
}
