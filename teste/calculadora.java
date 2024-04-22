import java.util.Scanner;

public class calculadora {

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

        if(operacao == '+'){
            num_1 = num_1 + num_2;
            System.out.println("O resultado da operação é: " + num_1);
        }else if(operacao == '-'){
            num_1 = num_1 - num_2;
            System.out.println("O resultado da operação é: " + num_1);
        }else if(operacao == '*'){
            num_1 = num_1 * num_2;
            System.out.println("O resultado da operação é: " + num_1);
        }else if(operacao == '/' ){
            num_1 = num_1 / num_2;
            System.out.println("O resultado da operação é: " + num_1);
        }else{
            System.out.println("Operação Inválida");
        }
        
        scanner.close();
    }
}