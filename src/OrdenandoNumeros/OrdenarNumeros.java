package OrdenandoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(42);
        numeros.add(15);
        numeros.add(8);
        numeros.add(23);
        numeros.add(4);
        numeros.add(16);
        numeros.add(9);
        numeros.add(30);

        System.out.println("Lista desordenada:");
        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("\nLista ordenada (crescente):");
        System.out.println(numeros);
    }
}
