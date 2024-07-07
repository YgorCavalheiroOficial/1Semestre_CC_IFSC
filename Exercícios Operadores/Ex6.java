import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        int n1, n2, t1, freq;
        double m;

        System.out.println("Insira a nota da primeira prova: ");
        n1 = in.nextInt();
        System.out.println("Insira a nota da segunda prova: ");
        n2 = in.nextInt();
        System.out.println("Insira a nota do trabalho: ");
        t1 = in.nextInt();
        System.out.println("Insira a frequência do aluno: ");
        freq = in.nextInt();

        m = n1 + n2 + t1;
        m = m / 3;
        System.out.println("Nota final: " + m);

        if(m >= 7){
            if(freq >= 75){
                System.out.println("Aluno Aprovado!");
            }else{
                System.out.println("Aluno Reprovado por falta!");
            }
        }
        if(m >= 6 && m < 7){
            if(freq >= 75 && freq < 90){
                System.out.println("Aluno em Recuperação!");
                if(freq >=90 && t1 >= 6){
                    System.out.println("Aluno aporvado por frequência!");
                }else{
                    System.out.println("Aluno Reprovado por falta!");
                }
            }
        }
        else if(t1 == 6){
            if (freq >= 90) {
                System.out.println("Aluno Aprovado por frequência!");
            }else{
                System.out.println("Aluno Reprovado!");
            }
        }
    }
}
