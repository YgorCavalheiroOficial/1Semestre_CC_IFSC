import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        int n1, n2, t1;
        double m;

        System.out.println("Insira a nota da primeira prova: ");
        n1 = in.nextInt();
        System.out.println("Insira a nota da segunda prova: ");
        n2 = in.nextInt();
        System.out.println("Insira a nota do trabalho: ");
        t1 = in.nextInt();

        m = n1 + n2 + t1;
        m = m / 3;
        System.out.println("Nota final: " + m);

        if(m >= 7){
            System.out.println("Aluno Aprovado!");
        }
        if(m >= 6 && m < 7){
            System.out.println("Aluno em Recuperação!");
        }
        else{
            System.out.println("Aluno Reprovado!");
        }

    }
}
