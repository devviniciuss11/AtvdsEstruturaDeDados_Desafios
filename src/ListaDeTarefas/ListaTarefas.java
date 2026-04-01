package ListaDeTarefas;
import java.util.LinkedList;

public class ListaTarefas {

    public static void main(String[] args) {

        LinkedList<String> tarefas = new LinkedList<>();

        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler livro");
        tarefas.add("Treinar academia");
        tarefas.add("Revisar conteúdo");

        System.out.println("Lista de tarefas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        System.out.println("\nPrimeira tarefa: " + tarefas.getFirst());
        System.out.println("Última tarefa: " + tarefas.getLast());
    }
}
