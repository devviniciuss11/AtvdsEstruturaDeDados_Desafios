package ProvaEstudos;

import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        Stack<Integer>  pilhaP = new Stack<>();
        System.out.println("Colocando elementos na Pilha:");
        pilhaP.push(10);
        pilhaP.push(20);
        pilhaP.push(30);
        System.out.println("Primeiro Elemento da Pilha:");
        System.out.println(pilhaP.peek());
        System.out.println("Tamanho da Pilha:");
        System.out.println(pilhaP.size());
        System.out.println("Pilha vazia? " + pilhaP.isEmpty());
        System.out.println("Pilha:");
        System.out.println(pilhaP);
        System.out.println("Elemento removido da Pilha:");
        System.out.println(pilhaP.pop());
        System.out.println("Pilha Atualizada:");
        System.out.println(pilhaP);

    }
}
