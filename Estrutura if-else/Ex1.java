import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do Kw: ");
        double precoKw = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o consumo em Kw: ");
        double consumoKw = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o dia de vencimento da conta: ");
        int diaVencimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o dia do pagamento: ");
        int diaPagamento = scanner.nextInt();
        scanner.nextLine();

        double valorConta = precoKw * consumoKw;


        if ((consumoKw > 70) && (diaPagamento > diaVencimento)){
            double multa = valorConta * 0.10;
            valorConta = valorConta + multa;
            System.out.println("Consumo elevado de energia!");
            System.out.println("O valor a ser pago é: " + valorConta);
        }else if ((consumoKw <= 70) && (diaPagamento > diaVencimento)) {
            double multa = valorConta * 0.10;
            valorConta = valorConta + multa;
            System.out.println("Você é um consumidor consciente! ");
            System.out.println("O valor a ser pago é: " + valorConta);
        }else if ((consumoKw > 70 ) && (diaPagamento <= diaVencimento)) {
            System.out.println("Consumo elevado de energia!");
            System.out.println("O valor a ser pago é: " + valorConta);
        } else{
            System.out.println("Você é um consumidor consciente! ");
            System.out.println("O valor a ser pago é: " + valorConta);
        }
        scanner.close();
    }
}
