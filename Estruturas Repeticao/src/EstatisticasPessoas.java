//Escreva um algoritmo, que leia um conjunto de 10 fichas, cada uma
//contendo, a altura e o código do sexo de uma pessoa (código = 1 se for
// masculino e 2 se for feminino), e calcule e imprima:
//-a maior altura da turma;
//-a média de altura das mulheres;
//-a média de altura da turma.

import java.util.Scanner;

public class EstatisticasPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTotal = 0;
        int contadorMulheres = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ficha " + (i + 1) + ":");
            System.out.println("Digite a altura (em metros):");
            double altura = scanner.nextDouble();

            System.out.println("Digite o código do sexo (1 para masculino, 2 para feminino):");
            int codigoSexo = scanner.nextInt();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (codigoSexo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }

            somaAlturaTotal += altura;
        }

        double mediaAlturaMulheres = contadorMulheres == 0 ? 0 : somaAlturaMulheres / contadorMulheres;
        double mediaAlturaTurma = somaAlturaTotal / 10;

        System.out.println("Maior altura da turma: " + maiorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Média de altura da turma: " + mediaAlturaTurma + " metros");

        scanner.close();
    }
}
