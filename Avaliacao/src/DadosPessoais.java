import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, numeroPessoa = 0;

        do {
            System.out.println("Insira o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Insira a idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            if(idade == 0){
                System.out.println("Programa encerrado: ");
                System.out.println("O total de pessoas registradas foi: " + numeroPessoa);
                break;
            }else {
                System.out.println("Insira o sexo: ");
                String sexo = scanner.nextLine();
                numeroPessoa++;
                System.out.println("Clique enter para registrar a próxima pessoa! ");
                scanner.nextLine();
            }
        } while (idade > 0);
        scanner.close();
    }
}
