//Escreva um programa para determinar o tipo de bilhete que cada visitante de
//um parque de diversão deve comprar. O tipo de bilhete é determinado em
//função da idade do visitante, de acordo com a tabela abaixo. O programa
//deverá solicitar a leitura de um novo bilhete. A execução do programa deverá
//encerrar quando o usuário informa “não”. Mostre no final a quantidade de
//bilhetes infantis e adultos vendidos.

//inferior a 6 - Isento de pagamento
//entre 6 e 12 - bilhete de criança
//entre 13 e 65 - bilhete normal
//mais de 65 - bilhete de terceira idade

import java.util.Scanner;

public class TipoBilheteParque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilhetesCrianca = 0;
        int bilhetesAdulto = 0;
        String continuar;

        do {
            System.out.println("Digite a idade do visitante:");
            int idade = scanner.nextInt();

            if (idade < 6) {
                System.out.println("Isento de pagamento.");
            } else if (idade >= 6 && idade <= 12) {
                System.out.println("Bilhete de criança.");
                bilhetesCrianca++;
            } else if (idade >= 13 && idade <= 65) {
                System.out.println("Bilhete normal.");
                bilhetesAdulto++;
            } else {
                System.out.println("Bilhete de terceira idade.");
                bilhetesAdulto++;
            }

            System.out.println("Deseja ler o bilhete de outro visitante? (sim/não)");
            continuar = scanner.next();
        } while (!continuar.equalsIgnoreCase("não"));

        System.out.println("Quantidade de bilhetes de criança vendidos: " + bilhetesCrianca);
        System.out.println("Quantidade de bilhetes de adulto vendidos: " + bilhetesAdulto);

        scanner.close();
    }
}
