import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        double n;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira um número: ");
        n = in.nextDouble();

        if(n % 2 == 0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é ímpar!");
        }
    }
}
