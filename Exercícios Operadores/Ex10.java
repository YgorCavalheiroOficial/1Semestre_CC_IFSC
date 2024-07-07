import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tamanhoPista, pesoAviao, visibilidade, intensidadeChuva;
        int numPassageiros;
        boolean sistemaAutomatizado;

        System.out.print("Tamanho da pista (em Km): ");
        tamanhoPista = scanner.nextDouble();

        System.out.print("Peso do avião (em toneladas): ");
        pesoAviao = scanner.nextDouble();

        System.out.print("Visibilidade (em metros): ");
        visibilidade = scanner.nextDouble();

        System.out.print("Intensidade da chuva (em mm, digite 0 se não estiver chovendo): ");
        intensidadeChuva = scanner.nextDouble();

        System.out.print("Número de passageiros: ");
        numPassageiros = scanner.nextInt();

        System.out.print("Possui sistema de decolagem automatizada (true/false): ");
        sistemaAutomatizado = scanner.nextBoolean();

        if (visibilidade < 20 && !sistemaAutomatizado) {
            System.out.println("O avião não pode decolar devido à baixa visibilidade e falta de sistema de decolagem automatizada.");
        }else if (intensidadeChuva > 5) {
            System.out.println("Nenhum avião não pode decolar devido à intensa chuva.");
        }else if (intensidadeChuva > 0 && numPassageiros > 100) {
            System.out.println("O avião não pode decolar devido à chuva e ao número de passageiros.");
        }else if(tamanhoPista < 1.5 && pesoAviao < 40) {
            System.out.println("O avião pode decolar.");
        } else if (tamanhoPista >= 1.5 && tamanhoPista <= 2 && pesoAviao <= 60) {
            System.out.println("O avião pode decolar.");
        } else if (tamanhoPista > 2) {
            System.out.println("O avião pode decolar.");
        }else{
            System.out.println("O avião não pode decolar.");
        }
    }
}


