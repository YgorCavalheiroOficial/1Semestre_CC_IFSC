package Exercicios;
import java.util.Scanner;

public class Questao_nove{
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        double valor = 0, raiz = 0;

        System.out.println("Insira um valor inteiro: ");
        valor = input.nextInt();
        
        raiz = Math.sqrt(valor);

        System.out.println("O valor da raíz quadrada de " + valor + " é : " + raiz);     
    }
}