package InterfaceList;
import java.util.ArrayList;
import java.util.List;

public class ListaCidades {

    public static void main(String[] args) {

        List<String> cidades = new ArrayList<>();

        cidades.add("Recife1");
        cidades.add("São Paulo23");
        cidades.add("Rio de Janeiro21");
        cidades.add("Salvador44");
        cidades.add("Fortwaleza12");

        System.out.println("Lista de cidades:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
