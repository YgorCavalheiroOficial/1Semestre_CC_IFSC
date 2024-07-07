import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        int totalParcelas, parcelasPagas;
        double valorParcela, totalPago, saldoDevedor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade total de parcelas do consórcio: ");
        totalParcelas = scanner.nextInt();

        System.out.print("Digite a quantidade de parcelas já pagas: ");
        parcelasPagas = scanner.nextInt();

        System.out.print("Digite o valor de cada parcela: R$");
        valorParcela = scanner.nextDouble();

        totalPago = parcelasPagas * valorParcela;

        saldoDevedor = (totalParcelas - parcelasPagas) * valorParcela;

        System.out.println("\nTotal já pago pelo cliente: R$" + totalPago);
        System.out.println("Saldo devedor: R$" + saldoDevedor);
    }
}
