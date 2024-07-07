/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Questao_cinco {
    public static void main(String[] args) {
        double y = 0;
        double  x = 0;

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Insira um valor para x: ");
        x = input.nextDouble();

        y = (3 * x) + 2;

        System.out.println("O valor de y(x) = 3x + 2 com o valor de x valendo " + x + " é: " + y);
    }
    
}
