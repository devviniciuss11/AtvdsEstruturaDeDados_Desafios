package Potência_com_recursão;

public class Potênciacomrecursão {

    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
    public static void main(String[] args) {
        System.out.println("2^3 = " + potencia(2, 3));
        System.out.println("5^0 = " + potencia(5, 0));
        System.out.println("3^4 = " + potencia(3, 4));
    }
}
