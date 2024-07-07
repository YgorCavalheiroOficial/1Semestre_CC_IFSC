import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int dia, mes, ano;
        boolean dataValida = true;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o dia:");
        dia = in.nextInt();

        System.out.println("Digite o mês:");
        mes = in.nextInt();

        System.out.println("Digite o ano:");
        ano = in.nextInt();

        if (ano < 0 || ano > 9999) {
            dataValida = false;
        } else if (mes < 1 || mes > 12) {
            dataValida = false;
        } else {
            if (mes == 2) {
                if (anoBissexto(ano)) {
                    if (dia < 1 || dia > 29) {
                        dataValida = false;
                    }
                } else {
                    if (dia < 1 || dia > 28) {
                        dataValida = false;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 1 || dia > 30) {
                    dataValida = false;
                }
            } else {
                if (dia < 1 || dia > 31) {
                    dataValida = false;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data inserida é válida.");
        } else {
            System.out.println("A data inserida é inválida.");
        }
    }
    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
