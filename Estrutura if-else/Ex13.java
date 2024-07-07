import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        String produto1, produto2, produto3;
        int estoque1, estoque2, estoque3;
        final int ESTOQUE_MINIMO = 30;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro produto:");
        produto1 = in.nextLine();

        System.out.println("Digite a quantidade em estoque do primeiro produto:");
        estoque1 = in.nextInt();

        System.out.println("Digite o nome do segundo produto:");

        in.nextLine();
        produto2 = in.nextLine();

        System.out.println("Digite a quantidade em estoque do segundo produto:");
        estoque2 = in.nextInt();

        System.out.println("Digite o nome do terceiro produto:");

        in.nextLine();
        produto3 = in.nextLine();

        System.out.println("Digite a quantidade em estoque do terceiro produto:");
        estoque3 = in.nextInt();

        System.out.println("Produtos abaixo do estoque mínimo (" + ESTOQUE_MINIMO + " unidades):");
        if (estoque1 < ESTOQUE_MINIMO) {
            System.out.println(produto1);
        }
        if (estoque2 < ESTOQUE_MINIMO) {
            System.out.println(produto2);
        }
        if (estoque3 < ESTOQUE_MINIMO) {
            System.out.println(produto3);
        }
    }
}
