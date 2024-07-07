import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int idade;
        String categoria;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        idade = in.nextInt();

        if (idade >= 5 && idade <= 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 17) {
            categoria = "Juvenil";
        } else if (idade >= 18 && idade <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Senior";
        }

        System.out.println("O nadador de " + idade + " anos pertence à categoria " + categoria + ".");
    }
}
