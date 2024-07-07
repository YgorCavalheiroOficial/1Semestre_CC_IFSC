import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");

        double peso = input.nextDouble();
        double novoPesoEngordar = peso + (peso * 0.15);
        double novoPesoEmagrecer = peso - (peso * 0.20);

        System.out.println("Novo peso se a pessoa engordar 15%: " + novoPesoEngordar);
        System.out.println("Novo peso se a pessoa emagrecer 20%: " + novoPesoEmagrecer);

    }
}
