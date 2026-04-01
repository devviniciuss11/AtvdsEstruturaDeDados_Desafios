package DesafioIntegrador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayParaLista {

    public static void main(String[] args) {

        int[] numeros = {42, 15, 8, 23, 4, 16, 9, 30};

        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            lista.add(numeros[i]);
        }

        System.out.println("\n\nLista antes da ordenação:");
        System.out.println(lista);
        Collections.sort(lista);

        System.out.println("\nLista após a ordenação:");
        System.out.println(lista);
    }
}
