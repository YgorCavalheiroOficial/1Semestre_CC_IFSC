import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        double base = 0, altura = 0, area = 0, perimetro = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        base = input.nextDouble();

        System.out.println("--------------------------------------");
        System.out.println("Insira um valor da altura: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = base * 2 + altura * 2;

        System.out.println("======================================");
        System.out.println("A área do seu retângulo é: " + area);
        System.out.println("E o perímetro do seu retângulo é: " + perimetro);
        System.out.println("======================================");

    }
}
