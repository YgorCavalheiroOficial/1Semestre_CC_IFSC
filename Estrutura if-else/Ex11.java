import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int hora, minuto, segundo;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a hora (0 a 23):");
        hora = in.nextInt();

        System.out.println("Digite o minuto (0 a 59):");
        minuto = in.nextInt();

        System.out.println("Digite o segundo (0 a 59):");
        segundo = in.nextInt();

        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
        System.out.printf("Novo horário: %02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
