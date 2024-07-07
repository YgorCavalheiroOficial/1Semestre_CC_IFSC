import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoQuilo = 39.00;
        double pesoPratoVazio = 0.45;

        System.out.print("Digite o peso do prato montado pelo cliente (em quilos): ");

        double pesoPratoMontado = input.nextDouble();
        double pesoTotal = pesoPratoMontado + pesoPratoVazio;
        double valorAPagar = pesoTotal * precoQuilo;

        System.out.println("O valor a pagar é: R$ " + valorAPagar);
    }
}
