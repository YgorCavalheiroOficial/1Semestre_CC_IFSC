import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){

        double c = 0, f = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma temperatura em Célsius:");
        c = input.nextDouble();

        f =  (9 * c + 160) / 5;

        System.out.println("===================================================================================");
        System.out.println("A conversão da temperatura em Célsius " + c + " para fahrenheit é: " + f + "F");
        System.out.println("===================================================================================");
    }
}
