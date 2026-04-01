package Ordem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNomes {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Eduardo");
        nomes.add("Daniela");
        nomes.add("Fernanda");

        System.out.println("Lista original:");
        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println("\nLista ordenada (alfabética):");
        System.out.println(nomes);
    }
}
