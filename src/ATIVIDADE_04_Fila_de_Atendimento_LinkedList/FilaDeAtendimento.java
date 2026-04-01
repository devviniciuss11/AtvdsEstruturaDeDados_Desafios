package ATIVIDADE_04_Fila_de_Atendimento_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class FilaDeAtendimento {
    public static void main(String[] args){
        LinkedList<String>fila=new LinkedList<>();
        Scanner sc1 = new Scanner(System.in);
        int sair = 0;
        while(sair != 9){
            System.out.println("Digite 1 para adicionar um cliente na fila");
            System.out.println("Digite 2 para exibir a fila completa");
            System.out.println("Digite 3 para exibir o ultimo da fila");
            System.out.println("Digite 4 para exibir o primeiro da fila");
            System.out.println("Digite 5 para realizar o atendimento de alguem da fila");
            System.out.println("Digite 6 para inserir um cliente com prioridade na fila");
            System.out.println("Digite 7 para fazer uma busca por pessoas na fila");
            System.out.println("Digite 8 para fazer um atendimento automaico");
            System.out.println("Digite 9 para sair do sistema");
            int escolha = sc1.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do cliente para adicionar na fila:");
                    Scanner sc = new Scanner(System.in);
                    String nome = sc.nextLine();
                    fila.addLast(nome);
                    break;

                case 2:
                    System.out.println("----Lista Completa de Clientes na Fila----");
                    System.out.println(fila);
                    System.out.println("------------------------------------------");
                    break;

                case 3:
                    System.out.println("Ultimo cliente da fila: ");
                    System.out.println(fila.getLast());
                    break;

                case 4:
                    System.out.println("Primeiro cliente da fila: ");
                    System.out.println(fila.getFirst());
                    break;
                case 5:
                    System.out.println("Realizando atendimento do cliente "+ fila.getFirst());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    fila.removeFirst();
                    System.out.println("atendimento Realizado!");
                    break;
                case 6:
                    System.out.println("Cliente com prioridade:");
                    System.out.println("Digite o nome do cliente com prioridade para adicionar no comeco da fila:");
                    Scanner sc3 = new Scanner(System.in);
                    String prio = sc3.nextLine();
                    fila.addFirst(prio);
                    break;
                case 7:
                    System.out.println("Digite o nome do cliente que está procurando na fila:");
                    sc1.nextLine();
                    String procurar = sc1.nextLine();

                    int posicao = fila.indexOf(procurar);

                    if (posicao != -1) {
                        System.out.println("O cliente está na fila na posição " + (posicao + 1));
                    } else {
                        System.out.println("Cliente não encontrado na fila.");
                    }
                    break;

                case 8:

                    while(!fila.isEmpty()){
                        String atendido = fila.poll();
                        System.out.println("Atendendo: "+ atendido);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("\nFila encerrada. Não há mais pessoas.");
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("saindo do sistema . . . .");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("tchau!");
                    sair = 9;
                    break;


            }

        }

    }
}
