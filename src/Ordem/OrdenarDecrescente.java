package Ordem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarDecrescente {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(15);
        numeros.add(8);
        numeros.add(23);
        numeros.add(4);
        numeros.add(16);
        numeros.add(9);

        System.out.println("Lista original:");
        System.out.println(numeros);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("\nLista em ordem decrescente:");
        System.out.println(numeros);
    }
}
