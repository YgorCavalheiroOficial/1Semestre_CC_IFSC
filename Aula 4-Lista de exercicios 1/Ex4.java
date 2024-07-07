import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int A = 0, B = 0, SQ = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro para A: ");
        A = input.nextInt();
        System.out.println("Insira o segundo valor inteiro para B: ");
        B = input.nextInt();

        SQ = A + B;
        SQ *= SQ;

        System.out.println("=====================================================");
        System.out.println("O resultado do quadrado da soma entre A e B: " + SQ);
        System.out.println("=====================================================");
    }
}
