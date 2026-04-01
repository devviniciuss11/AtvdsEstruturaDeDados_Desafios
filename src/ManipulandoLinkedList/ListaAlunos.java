package ManipulandoLinkedList;
import java.util.LinkedList;

public class ListaAlunos {

    public static void main(String[] args) {

        LinkedList<String> alunos = new LinkedList<>();

        alunos.addFirst("Carlos");
        alunos.addFirst("Ana");

        alunos.addLast("Bruno");
        alunos.addLast("Daniela");
        alunos.addLast("Eduardo");

        System.out.println("Lista de alunos:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
