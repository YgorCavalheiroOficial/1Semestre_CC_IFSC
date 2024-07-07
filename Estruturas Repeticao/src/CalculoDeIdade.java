// Elabore um algoritmos que leia o nome, idade, sexo de uma pessoa. O
//algoritmo encerras se a idade lida for igual a zero. Mostre a quantidade de
//repetições do algoritmo.

import javax.xml.transform.Source;
import java.util.Scanner;

public class CalculoDeIdade {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Digite o nome:");
            String nome;
            nome = scanner.nextLine();

            System.out.println("Digite o sexo: ");
            String sexo;
            sexo = scanner.nextLine();

            System.out.println("Digite a idade: ");
            int idade;
            idade = scanner.nextInt();
            scanner.nextLine();

            if(idade > 0){
                System.out.println("Nome registrado: " + nome);
                System.out.println("Idade registrada: " + idade);
                System.out.println("Sexo registrado: " + sexo);
                System.out.println("Os dados são válidos, acesso liberado para realizar um novo cadastro.");
            }else {
                System.out.println("Os dados apresentados não são válidos");
                System.out.println("Programa encerrado!");
                break;
            }
        }
        scanner.close();
    }
}
