import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]){
        double qwPrec, qwResid, conta;
        int dia;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        System.out.println("Insira o consumo: ");
        qwResid = in.nextInt();
        if(dia < 5){
            qwPrec = 0.80;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 0.80;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }

        System.out.println("Conta residência 1: R$" + conta);
        if (qwResid > 70){
            System.out.println("Alto consumo de energia!");
        }
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        System.out.println("Insira o consumo: ");
        qwResid = in.nextInt();
        if(dia < 5){
            qwPrec = 0.75;
            conta = qwPrec * qwResid;
        }

        else{
            qwPrec = 0.75;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }

        System.out.println("Conta residência 2: R$" + conta);
        if (qwResid > 70){
            System.out.println("Alto consumo de energia!");
        }
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        System.out.println("Insira o consumo: ");
        qwResid = in.nextInt();
        dia = in.nextInt();
        System.out.println("Insira o consumo: ");
        qwResid = in.nextInt();
        if(dia < 5){
            qwPrec = 1.0;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 1.0;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }

        System.out.println("Conta residência 3: R$" + conta);
        if (qwResid > 70){
            System.out.println("Alto consumo de energia!");
        }
        dia = 0;
        qwPrec = 0;
        qwResid = 0;

        System.out.println("Insira a data do pagamento: ");
        dia = in.nextInt();
        System.out.println("Insira o consumo: ");
        qwResid = in.nextInt();
        if(dia < 5){
            qwPrec = 1.20;
            conta = qwPrec * qwResid;
        }
        else{
            qwPrec = 1.20;
            qwPrec = qwPrec * qwResid;
            conta = qwPrec * 0.1;
            conta = conta + qwPrec;
        }
        System.out.println("Conta residência 4:R$" + conta);
        if (qwResid > 70){
            System.out.println("Alto consumo de energia!");
        }
    }
}
