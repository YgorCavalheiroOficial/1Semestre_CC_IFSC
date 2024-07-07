import java.util.Scanner;

public class JavaAdicao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        double numeroUm = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o segundo valor: ");
        double numeroDois = scanner.nextDouble();
        scanner.nextLine();

        double soma = numeroUm + numeroDois;

        if(soma <= 20){
            System.out.println("O soma entre o número 1 e o número 2 é menor ou igual a 20: " + soma);
            double subtracao = soma - 5;
            System.out.println("A soma do número 1 com o número 2 subtraido por 5 é: " + subtracao);
        }else{
            System.out.println("A soma do número 1 e o número 2 é maior que 20: " + soma);
            soma = soma + 8;
            System.out.println("A soma do número 1 com o número 2 mais 8 é: " + soma);
        }
        scanner.close();
    }
}
