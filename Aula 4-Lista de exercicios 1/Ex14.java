import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário no formato (horas minutos segundos): ");

        int horas = input.nextInt();
        int minutos = input.nextInt();
        int segundos = input.nextInt();
        int segundosDesdeInicioDoDia = horas * 3600 + minutos * 60 + segundos;
        int segundosRestantes = 24 * 3600 - segundosDesdeInicioDoDia;

        System.out.println("Segundos restantes até o final do dia: " + segundosRestantes);

    }
}
