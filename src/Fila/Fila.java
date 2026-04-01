package Fila;

public class Fila {

    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("Fila cheia! Não é possível enfileirar.");
            return;
        }

        fim = (fim + 1) % capacidade; // fila circular
        elementos[fim] = valor;
        tamanho++;

        System.out.println("Enfileirado: " + valor);
    }

    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Não é possível desenfileirar.");
            return -1;
        }

        int valor = elementos[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return valor;
    }

    public int primeiro() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return -1;
        }

        return elementos[inicio];
    }

    public void mostrar() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println("Fila está vazia? " + fila.estaVazia());

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        fila.mostrar();

        System.out.println("Primeiro da fila: " + fila.primeiro());

        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        fila.mostrar();

        System.out.println("Primeiro da fila: " + fila.primeiro());

        System.out.println("Fila está vazia? " + fila.estaVazia());
    }
}
