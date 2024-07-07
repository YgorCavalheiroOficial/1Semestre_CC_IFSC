import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        double x, y;
        int quadrante;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a abscissa (coordenada x) do ponto:");
        x = in.nextDouble();

        System.out.println("Digite a ordenada (coordenada y) do ponto:");
        y = in.nextDouble();

        if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else if (x > 0 && y < 0) {
            quadrante = 4;
        } else {
            quadrante = 0;
        }

        if (quadrante != 0) {
            System.out.println("O ponto está localizado no quadrante " + quadrante + ".");
        } else {
            System.out.println("O ponto está sobre um dos eixos ou na origem.");
        }
    }
}
