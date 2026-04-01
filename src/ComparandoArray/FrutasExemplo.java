package ComparandoArray;
import java.util.ArrayList;
import java.util.List;

public class FrutasExemplo {

    public static void main(String[] args) {

        String[] frutasArray = new String[5];

        frutasArray[0] = "Maçã";
        frutasArray[1] = "Banana";
        frutasArray[2] = "Laranja";
        frutasArray[3] = "Uva";
        frutasArray[4] = "Manga";

        System.out.println("Frutas (Array):");
        for (int i = 0; i < frutasArray.length; i++) {
            System.out.println(frutasArray[i]);
        }

        List<String> frutasLista = new ArrayList<>();

        frutasLista.add("Maçã");
        frutasLista.add("Banana");
        frutasLista.add("Laranja");
        frutasLista.add("Uva");
        frutasLista.add("Manga");
        frutasLista.add("Abacaxi");

        System.out.println("\nFrutas (ArrayList):");
        for (String fruta : frutasLista) {
            System.out.println(fruta);
        }
    }
}

