import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário no formato (horas minutos segundos): ");
        int horas = input.nextInt();
        int minutos = input.nextInt();
        int segundos = input.nextInt();

        int segundosDesdeInicioDoDia = horas * 3600 + minutos * 60 + segundos;

        System.out.println("Segundos desde o início do dia: " + segundosDesdeInicioDoDia);

    }
}
