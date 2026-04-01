package InvertendoPalavra;

import java.util.Scanner;

public class InverterPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        char[] pilha = new char[palavra.length()];
        int topo = -1;
        for (int i = 0; i < palavra.length(); i++) {
            topo++;
            pilha[topo] = palavra.charAt(i);
        }

        String palavraInvertida = "";
        while (topo >= 0) {
            palavraInvertida += pilha[topo];
            topo--;
        }

        System.out.println("Palavra invertida: " + palavraInvertida);

        scanner.close();
    }
}
