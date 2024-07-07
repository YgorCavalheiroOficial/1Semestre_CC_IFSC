public class Ex16 {
    public static void main(String[] args) {
        double salario = 1500.00;

        double c1 = 200.00;
        double c2 = 120.00;

        double multaConta1 = c1 * 0.02;
        double multaConta2 = c2 * 0.02;

        double totalAPagar = c1 + multaConta1 + c2 + multaConta2;
        double saldoRestante = salario - totalAPagar;

        System.out.println("Saldo restante do salário de João após pagar as contas: R$" + saldoRestante);
    }
}
