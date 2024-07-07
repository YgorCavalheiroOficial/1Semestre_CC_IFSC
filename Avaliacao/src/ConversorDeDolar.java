import java.util.Scanner;

public class ConversorDeDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em dólar: ");
        double dolar = scanner.nextDouble();
        scanner.nextLine();

        double real = dolar * 1.82;

        System.out.println("O valor escolhido em dólar convertido para real é: " + "R$" + real);

        scanner.close();
    }
}
