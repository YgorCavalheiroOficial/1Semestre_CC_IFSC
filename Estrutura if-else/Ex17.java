import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        double pesoTerra, pesoPlaneta = 0;
        int codigoPlaneta;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o peso na Terra (em kg):");
        pesoTerra = in.nextDouble();

        System.out.println("Digite o código do planeta:");
        codigoPlaneta = in.nextInt();

        switch (codigoPlaneta) {
            case 1:
                pesoPlaneta = pesoTerra * 0.37;
                break;
            case 2:
                pesoPlaneta = pesoTerra * 0.88;
                break;
            case 3:
                pesoPlaneta = pesoTerra * 0.38;
                break;
            case 4:
                pesoPlaneta = pesoTerra * 2.64;
                break;
            case 5:
                pesoPlaneta = pesoTerra * 1.15;
            case 6:
                pesoPlaneta = pesoTerra * 1.17;
                break;
            case 7:
                pesoPlaneta = pesoTerra * 1.18;
                break;
            default:
                System.out.println("Código de planeta inválido!");
                in.close();
                return;
        }

        System.out.println("O peso no planeta é: " + pesoPlaneta + " kg.");
    }
}
