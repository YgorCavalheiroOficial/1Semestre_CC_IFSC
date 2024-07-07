import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        c = scanner.nextInt();

        if (a + b < c) {
            System.out.println("A soma de A com B é menor que C.");
        } else if(a + b == c){
            System.out.println("A soma de A com B é igual a C. ");
        }else {
                System.out.println("A soma de A com B é maior do que C.");
        }
    }
}
