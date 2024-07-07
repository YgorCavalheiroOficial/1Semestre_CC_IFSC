//Faça um programa para calcular a conta final de um hóspede de um hotel
//fictício, considerando que: . Devem ser lidos o nome do hóspede, o tipo do
//apartamento utilizado (A, B, C), o número de diárias utilizadas pelo hóspede
//(que deverá ser superior a zero);
// O valor da diária é determinado pela seguinte tabela:
//TIPO DO APTO – VALOR DA DIÁRIA (R$)
//A – 150.00
//B – 100.00
//C – 75.00
//Calcule o total a pagar ( total a pagar é o valor da diária multiplicado pelo
//numero de dias hospedados)
// Escreva a conta final contendo: o nome do hóspede, o tipo do
//apartamento, valor total das diárias.
// Para cadastrar os dados de novo hóspede pergunte Deseja continuar
//S/N.

import java.util.Scanner;

public class ContaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 0;

        do {
            System.out.println("Digite o nome do hóspede:");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo do apartamento utilizado (A, B, C):");
            char tipoApartamento = scanner.next().charAt(0);

            System.out.println("Digite o número de diárias utilizadas pelo hóspede:");
            int numDiarias = scanner.nextInt();

            double valorDiaria = 0;

            switch (tipoApartamento) {
                case 'A':
                    valorDiaria = 150.00;
                    break;
                case 'B':
                    valorDiaria = 100.00;
                    break;
                case 'C':
                    valorDiaria = 75.00;
                    break;
                default:
                    System.out.println("Tipo de apartamento inválido!");
                    continue;
            }

            if (numDiarias <= 0) {
                System.out.println("Número de diárias inválido!");
                continue;
            }

            double totalPagar = valorDiaria * numDiarias;

            System.out.println("Conta Final:");
            System.out.println("Nome do hóspede: " + nome);
            System.out.println("Tipo do apartamento: " + tipoApartamento);
            System.out.println("Valor total das diárias: R$" + totalPagar);

            System.out.println("Deseja continuar (S/N)?");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
