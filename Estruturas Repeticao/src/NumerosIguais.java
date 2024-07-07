//Escreva uma algoritmo que leia dois valores. O algoritmo encerra quando o
//primeiro valor informado for igual ao segundo valor.

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 == numero2) {
                System.out.println("Os números são iguais!");
                System.out.println("Encerrando o programa.");
                break;
            } else {
                System.out.println("Os números são diferentes, continue tentando!");
            }
        }
        scanner.close();
    }
}

