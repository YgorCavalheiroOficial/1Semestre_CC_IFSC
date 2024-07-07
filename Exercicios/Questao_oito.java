package Exercicios;
import java.util.Scanner;

public class Questao_oito{
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        double valorum = 0, valordois = 0, valortres = 0, valorquatro = 0;

        System.out.println("Insira o primeiro valor: ");
        valorum = input.nextDouble();
        valorum = valorum * valorum;

        System.out.println("Insira o segundo valor: ");
        valordois = input.nextDouble();
        valordois = valordois * valordois;

        System.out.println("Insira o terceiro valor: ");
        valortres = input.nextDouble();
        valortres = valortres * valortres;

        System.out.println("Insira o valorquatro valor: ");
        valorquatro = input.nextDouble();
        valorquatro = valorquatro * valorquatro;

        System.out.println("O quadrado do primeiro valor é: " + valorum);
        System.out.println("O quadrado do segundo valor é: " + valordois);
        System.out.println("O quadrado do terceiro valor é: " + valortres);
        System.out.println("O quadrado do quarto valor é: " + valorquatro);

        
    }
}