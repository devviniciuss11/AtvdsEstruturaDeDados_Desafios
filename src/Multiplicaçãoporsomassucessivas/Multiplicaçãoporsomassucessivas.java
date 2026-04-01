package Multiplicaçãoporsomassucessivas;

public class Multiplicaçãoporsomassucessivas {

    // Função recursiva para multiplicar sem usar *
    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiplicar(a, b - 1);
        }
        return -multiplicar(a, -b);
    }
    public static void main(String[] args) {
        System.out.println("3 x 4 = " + multiplicar(3, 4));
        System.out.println("5 x 0 = " + multiplicar(5, 0));
        System.out.println("7 x -2 = " + multiplicar(7, -2));
    }
}
