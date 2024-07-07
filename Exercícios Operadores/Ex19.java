import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        int numero, soma = 0, digito;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 0 e 999: ");
        numero = scanner.nextInt();

        digito = numero % 10;
        soma += digito;
        numero /= 10;

        digito = numero % 10;
        soma += digito;
        numero /= 10;

        digito = numero % 10;
        soma += digito;

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
