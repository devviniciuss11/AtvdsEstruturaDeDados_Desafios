package Contagem_crescente_com_recursão;

import java.util.Scanner;

public class Crescente {

    public static void imprimirAteN(int n) {
        if (n < 0) {
            return;
        }
        imprimirAteN(n - 1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Digite um nomero para realizar a contagem crescente:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        imprimirAteN(n);
    }
}
