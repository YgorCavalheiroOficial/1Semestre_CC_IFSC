import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //quantidades
        float qCafe = input.nextFloat(); //quilo
        int lLeite = input.nextInt(); //litro
        int pBolacha = input.nextInt(); //pacote

        //custos
        float cCafe = (input.nextFloat())*qCafe;
        float cLeite = (input.nextFloat())*lLeite;
        float cBolacha = (input.nextFloat())*pBolacha;


        System.out.println("Gasto com café: "+cCafe);
        System.out.println("Gasto com leite: "+cLeite);
        System.out.println("Gasto com bolacha: "+cBolacha);

        DecimalFormat df = new DecimalFormat("#.##");
        float gTotal = cCafe + cLeite + cBolacha;
        System.out.println("Seu gasto total é: "+ df.format(gTotal));
    }
}
