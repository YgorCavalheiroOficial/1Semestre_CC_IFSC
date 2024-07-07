import java.util.Scanner;

public class Ex8 {
    public static void main(String args[]){
        double tempo, distancia, velocidade = 340;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Informe o tempo em segundos: ");
        tempo = in.nextDouble();

        distancia = velocidade * tempo;

        System.out.println("A distancia é de: " + distancia);

        if(distancia<200){
            System.out.println("Area de risco!");
        }else{
            System.out.println("Area segura.");
        }
    }
}
