package ControleDeNomes;
import java.util.ArrayList;

public class ListaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniela");
        nomes.add("Eduardo");

        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nQuantidade de nomes: " + nomes.size());

        if (!nomes.isEmpty()) {
            System.out.println("Primeiro nome: " + nomes.get(0));

            System.out.println("Último nome: " + nomes.get(nomes.size() - 1));
        }
    }
}
