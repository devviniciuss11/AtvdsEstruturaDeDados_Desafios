package Comparando;

import java.util.ArrayList;
import java.util.List;

public class ListaNumerosComparacao {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(9);
        numeros.add(25);
        numeros.add(31);
        numeros.add(45);
        numeros.add(65);

        System.out.println("Lista de números:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        System.out.println("\nQuantidade de elementos: " + numeros.size());

        int busca1 = 31;
        int busca2 = 99;

        System.out.println("\nO número " + busca1 + " está na lista? " + numeros.contains(busca1));
        System.out.println("O número " + busca2 + " está na lista? " + numeros.contains(busca2));
    }
}
