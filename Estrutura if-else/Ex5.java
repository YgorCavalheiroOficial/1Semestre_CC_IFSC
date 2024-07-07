import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        double n;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = in.nextDouble();

        if(n <= 10) {
            System.out.println("F1");
        } else if (n > 10 && n <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }
}
