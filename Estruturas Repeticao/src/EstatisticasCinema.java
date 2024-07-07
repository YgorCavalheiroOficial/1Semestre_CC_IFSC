//Um cinema possui capacidade de 20 lugares e está sempre com ocupação
//total. Certo dia, cada espectador respondeu a um questionário, no qual
//constava:
//-sua idade;
//-sua opinião em relação ao filme, segundo as seguintes notas:
//Nota Significado
//A Ótimo
//B Bom
//C Regular
//D Ruim
//Elabore um algoritmo que, lendo estes dados, calcule e imprima:
//-a quantidade de respostas ótimo;
//-a média de idade das pessoas que responderam ruim;
//-a diferença de idade entre a pessoa de maior idade com a pessoa de menor de idade que responderam o questionário.

import java.util.Scanner;

public class EstatisticasCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int contadorRuim = 0;
        int idadeMaior = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Resposta do espectador " + i + ":");

            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite a opinião em relação ao filme (A - Ótimo, B - Bom, C - Regular, D - Ruim):");
            char opiniao = scanner.next().charAt(0);

            if (opiniao == 'A') {
                quantidadeOtimo++;
            } else if (opiniao == 'D') {
                somaIdadeRuim += idade;
                contadorRuim++;
            }

            if (idade > idadeMaior) {
                idadeMaior = idade;
            }
        }

        double mediaIdadeRuim = contadorRuim == 0 ? 0 : (double) somaIdadeRuim / contadorRuim;
        int diferencaIdade = idadeMaior - 1;

        System.out.println("Quantidade de respostas Ótimo: " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam Ruim: " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa de maior idade e a de menor idade que responderam o questionário: " + diferencaIdade);

        scanner.close();
    }
}
