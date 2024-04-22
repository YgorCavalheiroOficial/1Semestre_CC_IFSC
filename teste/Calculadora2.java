import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args){

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro Valor: ");
        double num_1;
        num_1 = scanner.nextDouble();

        System.out.println("Insira a operação: ");
        char operacao;
        operacao = scanner.next().charAt(0);

        System.out.println("Insira o segundo valor: ");
        double num_2;
        num_2 = scanner.nextDouble();
       
        loop: while(true){
            switch (operacao) {
                case '+':
                    num_1 = num_1 + num_2;
                    System.out.println("O resultado da operação é: " + num_1);
                    break;
                case '-':
                    num_1 = num_1 - num_2;
                    System.out.println("O resultado da operação é: " + num_1);
                    break;
                case '*':
                    num_1 = num_1 * num_2;
                    System.out.println("O resultado da operação é: " + num_1);
                    break;
                case '/':
                    num_1 = num_1 / num_2;
                    System.out.println("O resultado da operação é: " + num_1);
                    break;
                default:
                    System.out.println("Operação inválida tente novamente: ");
                    break loop;
            }
        }
    }        

}   
