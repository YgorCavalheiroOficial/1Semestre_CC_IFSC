import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double a = 2500.0, b = 3200.0, c = 1600.0, d = 5000.0, e = 8000.0, f = 4200.0, g = 1600.0, h = 2000.0, salario;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = in.nextLine();

        System.out.println("Digite a categoria do funcionário: ");
        String categoria = in.nextLine();

        double percentualAumento = 0.0;

        if (categoria.equalsIgnoreCase("a")) {
            salario = a;
            percentualAumento = 0.10;
        } else if (categoria.equalsIgnoreCase("b")) {
            salario = b;
            percentualAumento = 0.15;
        } else if (categoria.equalsIgnoreCase("c")) {
            salario = c;
            percentualAumento = 0.25;
        } else if (categoria.equalsIgnoreCase("d")) {
            salario = d;
            percentualAumento = 0.15;
        } else if (categoria.equalsIgnoreCase("e")) {
            salario = e;
            percentualAumento = 0.15;
        } else if (categoria.equalsIgnoreCase("f")) {
            salario = f;
            percentualAumento = 0.25;
        } else if (categoria.equalsIgnoreCase("g")) {
            salario = g;
            percentualAumento = 0.30;
        } else if (categoria.equalsIgnoreCase("h")) {
            salario = h;
            percentualAumento = 0.10;
        } else {
            System.out.println("Categoria inválida!");
            in.close();
            return;
        }

        double novoSalario = salario * (1 + percentualAumento);
        System.out.println("O salário atual de " + nome + " é: R$" + salario);
        System.out.println("Com o aumento salarial, passa a ser: R$" + novoSalario);
    }
}

