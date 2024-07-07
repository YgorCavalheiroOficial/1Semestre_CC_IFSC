import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int numeroConta;
        double saldoAtual, valorOperacao, novoSaldo;
        int tipoOperacao;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        numeroConta = in.nextInt();

        System.out.println("Digite o saldo atual da conta:");
        saldoAtual = in.nextDouble();

        System.out.println("Digite o tipo de operação (1 - Depósito, 2 - Saque):");
        tipoOperacao = in.nextInt();

        System.out.println("Digite o valor da operação:");
        valorOperacao = in.nextDouble();

        novoSaldo = saldoAtual;

        if (tipoOperacao == 1) {
            novoSaldo += valorOperacao;
        } else if (tipoOperacao == 2) {
            novoSaldo -= valorOperacao;
            if (novoSaldo < 0) {
                System.out.println("Conta estourada");
            }
        } else {
            System.out.println("Tipo de operação inválido");
        }

        System.out.println("Novo saldo da conta " + numeroConta + ": R$" + novoSaldo);

    }
}


