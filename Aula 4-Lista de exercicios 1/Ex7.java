import java.util.Scanner;

//tp1 = tipo de picolé 1
//tp2 = tipo de picolé 2
//tp3 = tipo de picolé 3
//v_tp1 = valor do picolé 1
//v_tp2 = valor do picolé 2
//v_tp3 = valor do picolé 3
//vt = valor total de vendas

public class Ex7 {
    public static void main(String[] args){

        double tp1 = 1.50, tp2 = 2.00, tp3 = 0.75;

        double v_tp1 = 0, v_tp2 = 0, v_tp3 = 0, tv = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade vendida do picolé tipo 1:");
        v_tp1 = input.nextDouble();

        v_tp1 = v_tp1 * tp1;

        System.out.println("=====================================================");

        System.out.println("Insira a quantidade vendida do picolé tipo 2:");
        v_tp2 = input.nextDouble();

        v_tp2 = v_tp2 * tp2;

        System.out.println("=====================================================");

        System.out.println("Insira a quantidade vendida do picolé tipo 3:");
        v_tp3 = input.nextDouble();

        v_tp3 = v_tp3 * tp3;

        System.out.println("=====================================================");
        System.out.println("O valor arrecadado do picolé tipo 1 foi: " + v_tp1);
        System.out.println("=====================================================");
        System.out.println("O valor arrecadado do picolé tipo 2 foi: " + v_tp2);
        System.out.println("=====================================================");
        System.out.println("O valor arrecadado do picolé tipo 3 foi: " + v_tp3);
        System.out.println("=====================================================");

        tv = v_tp1 + v_tp2 + v_tp3;

        System.out.println("O valor total das vendas foi de: " + "R$" + tv);

    }
}
