import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números não são iguais.");
        }
    }
}
