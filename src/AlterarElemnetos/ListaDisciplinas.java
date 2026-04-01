package AlterarElemnetos;
import java.util.ArrayList;
import java.util.List;

public class ListaDisciplinas {

    public static void main(String[] args) {

        List<String> disciplinas = new ArrayList<>();

        disciplinas.add("Matemática");
        disciplinas.add("Português");
        disciplinas.add("História");
        disciplinas.add("Geografia");
        disciplinas.add("Física");

        System.out.println("Lista original:");
        System.out.println(disciplinas);

        disciplinas.set(2, "Biologia");

        System.out.println("\nLista após alteração:");
        System.out.println(disciplinas);
    }
}
