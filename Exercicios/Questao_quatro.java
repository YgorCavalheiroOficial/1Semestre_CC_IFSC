/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author YgorC
 */
public class Questao_quatro {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        String nome;
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        String end;
        System.out.println("Digite seu endereço: ");
        end = input.nextLine();

        String tel;
        System.out.println("Digite seu telefone: ");
        tel = input.nextLine();

        System.out.println("Dados de " + nome);

        System.out.println("Nome: " + nome);
        System.out.println("Enderço: " + end);
        System.out.println("Contato: " + tel);
    }
}
