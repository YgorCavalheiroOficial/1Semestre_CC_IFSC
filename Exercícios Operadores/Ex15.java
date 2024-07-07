import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBruto, descontoINSS, descontoIR, salarioLiquido, auxilioDependentes;
        int numDependentes;


        System.out.print("Digite o salário bruto: ");
        salarioBruto = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        numDependentes = scanner.nextInt();


        descontoINSS = salarioBruto * 0.11;


        salarioLiquido = salarioBruto - descontoINSS;


        descontoIR = salarioBruto * 0.15;


        salarioLiquido = salarioLiquido - descontoIR;


        auxilioDependentes = numDependentes * 150.0;


        salarioLiquido = salarioLiquido + auxilioDependentes;


        System.out.println("O salário líquido é: R$" + salarioLiquido);

    }
}
