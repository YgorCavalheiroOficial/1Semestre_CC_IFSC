import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){

        int a = 0;
        int h, m, s;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de segundos total: ");
        a = in.nextInt();

        h = a / 3600;
        m = (a % 3600) / 60;
        s = a % 60;

        System.out.println("O Tempo total é : " + h + "h : " + m + "m : " + s + "s");
    }
}
