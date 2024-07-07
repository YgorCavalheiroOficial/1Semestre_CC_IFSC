// Elabore um algoritmo que leia dois números inteiros. O segundo número lido
//deverá ser maior que o primeiro número. Mostre a soma dos dois números
//lidos.
import java.util.Scanner;

public class SomaDosNumeros {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Digite um número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro");
            int numero2 = scanner.nextInt();

            if(numero2 >= numero1){
                System.out.println("O primeiro número é menor ou igual ao segundo, continue!");
            }else{
                System.out.println("O primeiro número é maior que o segundo, programa encerrado!");
                break;
            }
            numero1 = numero1 + numero2;
            System.out.println("A soma dos números é: " + numero1);
        }
        scanner.close();
    }
}
