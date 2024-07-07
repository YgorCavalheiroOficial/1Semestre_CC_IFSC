/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

/**
 *
 * @author YgoC
 */

public class Questao_dois {
    public static void main(String args[]){
        
        int numero;
        int ant;
        int suc;
         
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = input.nextInt();

        ant = numero - 1;
        suc = numero + 1;
        
        System.out.println("Seu numero é: " + numero);
        System.out.println("O antecessor do número escolhido é: " + ant);
        System.out.println("O sucessor do número escolhido é: " + suc);
    }
}
