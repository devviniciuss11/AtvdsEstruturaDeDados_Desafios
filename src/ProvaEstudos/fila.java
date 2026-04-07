package ProvaEstudos;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[]args){
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Eduardo");
        System.out.println("Mostrando a fila:");
        System.out.println(fila);
        System.out.println("Mostrando o primeiro elemento da fila:");
        System.out.println(fila.peek());
        System.out.println("atendendo primeiro da fila");
        System.out.println(fila.poll());
        System.out.println("fila atualizada:");
        System.out.println(fila);
    }
}
