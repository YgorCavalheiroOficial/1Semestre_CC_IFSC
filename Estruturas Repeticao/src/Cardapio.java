//O cardápio de uma lancheria é o seguinte:

//Especificação             Código              Preço
//Cachorro quente            100                 4,00
//X Salada                   101                 6,00
//Bauru com ovo              102                 6,50
//Refrigerante               103                 2,00

//Escrever um algoritmo que mostre o cardápio para o usuário e permita que o
//usuário informe o código do item pedido, a quantidade e calcule o valor a ser
//pago por aquele lanche. Mostre na tela o item pedido e o valor a ser pago.


import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pedidos;

        System.out.println("Lanches e bebidas disponíveis: \n" +
                "Código (100) Cachorro quente - R$4,00\n" +
                "Código (101) X Salada - R$6,00\n" +
                "Código (102) Bauru com ovo - R$6,50\n" +
                "Código (103) Refrigerante - R$2,00\n");

        System.out.println("Digite a quantidade de pedidos que deseja: ");
        pedidos = scanner.nextInt();

        for (int i = 0; i < pedidos; i++) {
            System.out.println("Escolha seu pedido " + (i + 1) + ": ");
            int codigo = scanner.nextInt();
            int quantidade;
            double preco = 0.0;

            switch (codigo) {
                case 100:
                    System.out.println("Cachorro quente");
                    preco = 4.00;
                    break;
                case 101:
                    System.out.println("X Salada");
                    preco = 6.00;
                    break;
                case 102:
                    System.out.println("Bauru com ovo");
                    preco = 6.50;
                    break;
                case 103:
                    System.out.println("Refrigerante");
                    preco = 2.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            System.out.println("Digite a quantidade desejada: ");
            quantidade = scanner.nextInt();
            double total = preco * quantidade;

            System.out.println("Item pedido: " + codigo);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor a ser pago: R$" + total);
        }

        scanner.close();
    }
}
