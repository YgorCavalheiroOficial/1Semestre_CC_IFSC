import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){

    double salario = 0, comissão_c = 150.00, comissao_p = 0.05, vendas = 0, total_vendas = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do salário: ");

        salario = in.nextDouble();

        System.out.println("Insira a quantidade de carros vendidos:");

        vendas = in.nextDouble();

        System.out.println("Insira o valor total das vendas:");

        total_vendas = in.nextDouble();

        comissão_c = comissão_c * vendas;

        comissao_p = total_vendas * comissao_p;

        salario = salario * 2 + comissão_c + comissao_p;

        System.out.println("O valor do total do salário é: " + salario);

    }
}
