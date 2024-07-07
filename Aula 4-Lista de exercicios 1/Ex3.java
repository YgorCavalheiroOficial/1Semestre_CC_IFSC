import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int A = 0, B = 0, SQ = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro para A: ");
        A = input.nextInt();
        System.out.println("Insira o segundo valor inteiro para B: ");
        B = input.nextInt();

        A *= A;
        B *= B;
        SQ = A + B;

        System.out.println("=====================================================");
        System.out.println("Resultado da soma dos quadrados de A e B: " + SQ);
        System.out.println("=====================================================");
    }
}
