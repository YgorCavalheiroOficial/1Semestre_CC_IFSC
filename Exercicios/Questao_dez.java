package Exercicios;
import java.util.Scanner;

public class Questao_dez{
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        double celcius = 0;
        double fahreheit = 0;

        System.out.println("Digite um valor em Celcius:");
        celcius = input.nextDouble();

        fahreheit = (9 * celcius + 160) / 5;

        System.out.println("A temperatura em Celcius " + celcius + " convertida para Fahreheit é: " + fahreheit);

        
    }
}