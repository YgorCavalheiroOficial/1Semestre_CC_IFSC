import java.util.Scanner;

public class Ex9 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        double valorCompra, valorPago, troco;

        int[] notas = {100, 10, 1};

        int[] quantidadeNotas = new int[notas.length];

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: ");
        valorPago = scanner.nextDouble();

        troco = valorPago - valorCompra;

        System.out.println("Valor da compra: R$" + valorCompra);
        System.out.println("Valor pago pelo cliente: R$" + valorPago);

        System.out.println("Troco: R$" + troco);


        int trocoInteiro = (int) troco;
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = trocoInteiro / notas[i];
            trocoInteiro %= notas[i];
        }

        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.println("Notas de R$" + notas[i] + ": " + quantidadeNotas[i]);
            }
        }
    }
}
