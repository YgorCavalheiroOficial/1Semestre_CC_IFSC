import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        int a = 0;
        double quociente = 0;
        double res = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        a = in.nextInt();

        quociente = (double) a / 2;
        res = (double) a % 2;

        System.out.println("O quociente é: " + quociente);
        System.out.println("O resto de divisão é: " + res);


    }
}
