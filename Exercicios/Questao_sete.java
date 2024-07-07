package Exercicios;
import java.util.Scanner;

/**
 *
 * @author YgorC
 */

//Cálculo do quadrado.

public class Questao_sete {

    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);

        int numero;
        numero = 0;


        System.out.println("Digite um número inteiro: ");
        numero = input.nextInt();

        numero = numero * numero;
    

        System.out.println("O quadrado do número escolhido é: " + numero);
    }

}

