import java.util.Scanner;

public class Ex7 {
    public static void main(String args[]){
        double comp, larg,alt, area_piso,area_parede,area_sala, volume;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira a altura da sala: ");
        alt = in.nextDouble();
        System.out.println("Insira a largura da sala: ");
        larg = in.nextDouble();
        System.out.println("Insira o comprimemto da sala; ");
        comp = in.nextDouble();

        area_sala = comp * alt;
        area_parede = larg * alt;
        area_parede = area_parede * 4;
        area_piso = larg * comp;
        volume = larg * comp * alt;

        System.out.println("A área das paredes é: " + area_parede);
        System.out.println("A área do piso é: " + area_piso);
        System.out.println("E o volume da sala é: " + volume);

        if(volume <= 100){
            System.out.println("Deve se instalar um ar-condicionado pequeno");
        }
        else if(volume >= 100 && volume < 500){
            System.out.println("Deve se instalar um ar-condicionado médio");
        }else{
            System.out.println("Deve se instalar um ar-condicionado grande");
        }
    }
}
