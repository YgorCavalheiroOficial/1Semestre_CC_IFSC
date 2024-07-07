import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        double altura,imc,peso;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em Kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc > 25) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está dentro do peso ideal.");
        }
    }
}
