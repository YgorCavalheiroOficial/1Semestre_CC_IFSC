import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        double distancia, consumoMedio, precoLitro, gastosCombustivel;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância a ser percorrida (em Km): ");
        distancia = scanner.nextDouble();

        System.out.print("Consumo médio do carro (Km/litro): ");
        consumoMedio = scanner.nextDouble();

        System.out.print("Preço do litro do combustível (em R$): ");
        precoLitro = scanner.nextDouble();

        gastosCombustivel = (distancia / consumoMedio) * precoLitro;

        System.out.println("Gastos com combustível na viagem: R$" + gastosCombustivel);
    }
}
