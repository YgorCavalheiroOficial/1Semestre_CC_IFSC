import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        double qwPrec, qwResid, conta;
        int dia;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();

        if(dia < 5){
            qwPrec = 0.80;
            qwResid = 60;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 0.80;
            qwResid = 60;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }

        System.out.println("Conta residência 1: R$" + conta);
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        if(dia < 5){
            qwPrec = 0.75;
            qwResid = 100;
            conta = qwPrec * qwResid;
        }

        else{
            qwPrec = 0.75;
            qwResid = 100;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }

        System.out.println("Conta residência 2: R$" + conta);
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        if(dia < 5){
            qwPrec = 1.0;
            qwResid = 80;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 1.0;
            qwResid = 80;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }
        System.out.println("Conta residência 3: R$" + conta);
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        if(dia < 5){
            qwPrec = 1.20;
            qwResid = 50;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 1.20;
            qwResid = 50;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }
        System.out.println("Conta residência 4:R$" + conta);
    }
}
