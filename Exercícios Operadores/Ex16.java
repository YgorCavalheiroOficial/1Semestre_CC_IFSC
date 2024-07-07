import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        double precoMercadoria1Dia1, precoMercadoria2Dia1, precoMercadoria3Dia1;
        double precoMercadoria1Dia2, precoMercadoria2Dia2, precoMercadoria3Dia2;
        double inflacao;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite os preços das mercadorias no dia 01/01/2022:");
        System.out.print("Preço da mercadoria 1: ");
        precoMercadoria1Dia1 = scanner.nextDouble();
        System.out.print("Preço da mercadoria 2: ");
        precoMercadoria2Dia1 = scanner.nextDouble();
        System.out.print("Preço da mercadoria 3: ");
        precoMercadoria3Dia1 = scanner.nextDouble();


        System.out.println("\nDigite os preços das mercadorias no dia 01/02/2022:");
        System.out.print("Preço da mercadoria 1: ");
        precoMercadoria1Dia2 = scanner.nextDouble();
        System.out.print("Preço da mercadoria 2: ");
        precoMercadoria2Dia2 = scanner.nextDouble();
        System.out.print("Preço da mercadoria 3: ");
        precoMercadoria3Dia2 = scanner.nextDouble();


        inflacao = ((precoMercadoria1Dia2 - precoMercadoria1Dia1) + (precoMercadoria2Dia2 - precoMercadoria2Dia1) + (precoMercadoria3Dia2 - precoMercadoria3Dia1)) / 3.0;


        if (inflacao > 0.55) {
            System.out.println("\nA inflação de " + inflacao +" está acima da meta.");
        }else if(inflacao == 0.55) {
            System.out.println("\nA inflação de " + inflacao + " está dentro da meta.");
        }else{
            System.out.println("\nA inflação de " + inflacao + " está abaixo da meta");
        }

    }
}
