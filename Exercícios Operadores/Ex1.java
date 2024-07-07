public class Ex1 {
    public static void main(String[]args){
        int a,b,c,d,e, e2,f, f2, f3;

        System.out.println("Expressão 1: 5 + 3 * 6 / 2 >= 10");
        a = 5 + 3 * 6 / 2;
        System.out.println("Resultado: " + a + " True");
        System.out.println("=================================");

        System.out.println("Expressão 2: 36 / 3 * 2 - 5 +8 == 27");
        b = ((36 / 30)* 2) - 5 + 8;
        System.out.println("Resultado: " + b + " False");
        System.out.println("=================================");

        System.out.println("Expressão 3: !(30 / 4 * 6 == 15)");
        c = 30 / 4 * 6;
        System.out.println("Resultado: " + c + " False");
        System.out.println("=================================");

        System.out.println("Expressão 4: (30 % 4 * 6 == 12) || true");
        d = 30 % 4 * 6;
        System.out.println("Resultado: " + d + " True");
        System.out.println("=================================");

        System.out.println("Expressão 5: (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)");
        e = (5 * 7 % 3) + 4 / 2 + 5;
        e2 = 12 / 4;
        System.out.println("Resultado: " + e + " == " + e2 + " False");
        System.out.println("=================================");

        System.out.println("Expressão 6: (((5 * 7 % 3 + 5) / 2 + 5) <= 14) II (! (12 / 4 < 8 * 2))");
        f = ((5 * 7 % 3 + 5) / 2 + 5);
        f2 = 12 / 4;
        f3 = 8 * 2;
        System.out.println("Resultado: " + f + " <= 14" + " & " + f2 + " != " + f3 + " False");
        System.out.println("=================================");
    }
}
