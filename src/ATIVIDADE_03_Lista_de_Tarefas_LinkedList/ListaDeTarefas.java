package ATIVIDADE_03_Lista_de_Tarefas_LinkedList;

import java.util.LinkedList;

public class ListaDeTarefas {
    public static void main(String[]args){

        LinkedList<String>tarefas=new LinkedList<>();
        tarefas.add("estudar java\n");
        tarefas.add("fazer Exercicios\n");
        tarefas.add("se esforcar\n");
        tarefas.add("ser dedicado\n");

        System.out.println("Lista de tarefas");
        System.out.println(tarefas);

        System.out.println("primeira tarefa:");
        System.out.println(tarefas.getFirst());

        System.out.println("mostrando ultima tarefa:");
        System.out.println(tarefas.getLast());

        System.out.println("mostrando tamanho da lista:");
        System.out.println(tarefas.size());

        System.out.println("adicionando nova tarefa no inicio da lista:");
        tarefas.addFirst("Ver video aulas");
        System.out.println(tarefas);

        System.out.println("adicionando nova tarefa no final da lista:");
        tarefas.addLast("se alimentar bem");
        System.out.println(tarefas);

        System.out.println("removendo a primeira tarefa:");
        tarefas.removeFirst();
        System.out.println(tarefas);

        System.out.println("removendo a ultima tarefa:");
        tarefas.removeLast();
        System.out.println(tarefas);

        tarefas.remove("estudar java");
        System.out.println(tarefas);

        tarefas.contains("revisar prova");

        System.out.println("Mostre a tarefa que está na posição 3.");
        System.out.println(tarefas.get(3));

        System.out.println("Altere a tarefa da posição 2 para \"Treinar LinkedList\".");
        tarefas.set(2,"Treinar LinkedList");
        System.out.println(tarefas);

        System.out.println("\nLista final (for-each):");
        for (String Tarefas : tarefas) {
            System.out.println(Tarefas);
        }

        System.out.println("\nPercorrendo com for tradicional:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Posição " + i + ": " + tarefas.get(i));
        }


    }
}
