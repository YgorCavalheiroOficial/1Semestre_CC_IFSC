import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do lado X:");
        x = in.nextDouble();

        System.out.println("Digite o valor do lado Y:");
        y = in.nextDouble();

        System.out.println("Digite o valor do lado Z:");
        z = in.nextDouble();

        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}

