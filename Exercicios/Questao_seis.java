package Exercicios;

import java.util.Scanner;
/**
 *
 * @author YgorC
 */

//Cálculo do consumo de um veículo.

public class Questao_seis {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        double consumo;

        double distancia;
        System.out.println("Digite a distância: ");
        distancia = input.nextDouble();

        double volume;
        System.out.println("Digite o volume de combustível: ");
        volume = input.nextDouble();

        consumo = distancia / volume;

        System.out.println("O valor de seu consumo é de: " + consumo + "Km/L");
    
    }
}