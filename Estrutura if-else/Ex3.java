import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        double peso, altura, imc;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira o peso em kg: ");
        peso = in.nextDouble();

        System.out.println("Insira a altura em metros: ");
        altura = in.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 20){
            System.out.println("Magro: " + imc);
        }else if(imc >= 20 && imc <= 24.99){
            System.out.println("Normal: " + imc);
        }else if(imc >= 25 && imc <= 30){
            System.out.println("Sobrepeso: " + imc);
        }else{
            System.out.println("Obeso: " + imc);
        }

    }
}
