//Construir um algoritmo que calcule o imposto de renda de um contribuinte,
//considerando que seus dados (CPF, renda mensal e classe de renda) são
//valores informados pelo usuário. Mostre na tela a alíquota de desconto
//aplicada e o valor a ser descontado. O algoritmo encerra quando for informado
//o CPF 00
//CLASSE ALÍQUOTA
//A isento
//B 5%
//C 10%
// D 15%
// E 20

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpf;
        double rendaMensal;
        char classeRenda;
        double aliquota = 0;
        double valorDesconto;

        do {
            System.out.println("Digite o CPF do contribuinte (ou '00' para encerrar):");
            cpf = scanner.nextLine();

            if (cpf.equals("00")) {
                break;
            }

            System.out.println("Digite a renda mensal do contribuinte:");
            rendaMensal = scanner.nextDouble();

            System.out.println("Digite a classe de renda do contribuinte (A, B, C, D, E):");
            classeRenda = scanner.next().charAt(0);

            switch (classeRenda) {
                case 'A':
                    aliquota = 0;
                    break;
                case 'B':
                    aliquota = 0.05;
                    break;
                case 'C':
                    aliquota = 0.1;
                    break;
                case 'D':
                    aliquota = 0.15;
                    break;
                case 'E':
                    aliquota = 0.2;
                    break;
                default:
                    System.out.println("Classe de renda inválida!");
                    continue;
            }

            valorDesconto = rendaMensal * aliquota;

            System.out.println("Alíquota de desconto aplicada: " + (aliquota * 100) + "%");
            System.out.println("Valor a ser descontado: R$" + valorDesconto);

        } while (!cpf.equals("00"));

        scanner.close();
    }
}
