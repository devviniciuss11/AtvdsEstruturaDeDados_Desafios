package Implementandoumapilhanaprática;

public class Implementandoumapilhanaprática {

    private int[] elementos;
    private int topo;
    private int capacidade;

    public Implementandoumapilhanaprática(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("Pilha cheia! Não é possível empilhar.");
            return;
        }
        topo++;
        elementos[topo] = valor;
        System.out.println("Empilhado: " + valor);
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia! Não é possível desempilhar.");
            return -1;
        }
        int valor = elementos[topo];
        topo--;
        return valor;
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    public void mostrar() {
        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Implementandoumapilhanaprática pilha = new Implementandoumapilhanaprática(5);

        System.out.println("Pilha está vazia? " + pilha.estaVazia());

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.mostrar();

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Desempilhado: " + pilha.desempilhar());
        System.out.println("Desempilhado: " + pilha.desempilhar());

        pilha.mostrar();

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Pilha está vazia? " + pilha.estaVazia());
    }
}
