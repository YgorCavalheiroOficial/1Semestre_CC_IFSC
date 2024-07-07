import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        double nota1, nota2, trabalho;
        Scanner in =  new Scanner(System.in);

        System.out.println("Insira a nota da primeira prova do aluno: ");
        nota1 = in.nextDouble();

        System.out.println("Insira a nota da segunda prova do aluno: ");
        nota2 = in.nextDouble();

        System.out.println("Insira a nota do trabalho do aluno: ");
        trabalho = in.nextDouble();


        if( trabalho >= 7 && (nota1 >= 6 || nota2 >= 6)){
            System.out.println("Parabéns, você foi aprovado!");
            System.out.println("Nota da prova 1: " + nota1 + " | " + " Nota da prova 2: " + nota2 + " | " + " Nota do trabalho: " + trabalho);
        }else{
            System.out.println("Infelizmente, você não foi aprovado :(");
            System.out.println("Nota da prova 1: " + nota1 + " | " + " Nota da prova 2: " + nota2 + " | " + " Nota do trabalho: " + trabalho);
        }
    }
}
