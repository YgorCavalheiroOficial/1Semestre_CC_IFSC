import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        double saldoMedio, valorCredito = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o saldo médio do cliente:");
        saldoMedio = in.nextDouble();

        if (saldoMedio <= 200) {
            valorCredito = saldoMedio * 0.1;
        } else if (saldoMedio <= 300) {
            valorCredito = saldoMedio * 0.2;
        } else if (saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.25;
        } else {
            valorCredito = saldoMedio * 0.3;
        }

        System.out.println("O saldo médio do cliente é: " + saldoMedio + " e o valor do crédito é: " + valorCredito);
    }
}
