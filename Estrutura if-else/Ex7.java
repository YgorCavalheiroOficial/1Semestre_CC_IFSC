import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        double number_1, number_2, number_3;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Input number 1: ");
        number_1 = in.nextDouble();

        System.out.println("Input number 2: ");
        number_2 = in.nextDouble();

        System.out.println("Input number 3 ");
        number_3 = in.nextDouble();

        if((number_1 <= number_2) && (number_1 <= number_3)){
            if (number_2 <= number_3){
            System.out.println("Number 1: " + number_1 + ", Number 2: " + number_2 + ", Number 3: " + number_3 + ".");
            }else {
            System.out.println("Number 1: " + number_1 + ", Number 3: " + number_3 + ", Number 2: " + number_2 + ".");
            }
        }else if((number_2 <= number_1) && (number_2 <= number_3)){
            if(number_1 <= number_3){
                System.out.println("Number 2: " + number_2 + ", Number 1: " + number_1 + ", Number 3: " + number_3 + ".");
            }else{
                System.out.println("Number 2: " + number_2 + ", Number 3: " + number_3 + ", Number 1: " + number_1 + ".");
            }
        }else if (number_3 <= number_1){
            if(number_2 <= number_1){
                System.out.println("Number 3: " + number_3 + ", Number 2: " + number_2 + ", Number 1: " + number_1 + ".");
            }else{
                System.out.println("Number 3: " + number_3 + ", Number 1: " + number_1 + ", Number 2: " + number_2 + ".");
            }
        }
    }
}
