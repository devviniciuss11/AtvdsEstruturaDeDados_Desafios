package ATIVIDADE_HASHMAP_HASHSET;
import java.util.HashMap;
import java.util.Scanner;

public class ContadorPalavras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite a Frase para realizar a contagem de palavras:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        HashMap<String, Integer> contador = new HashMap<>();

        for(String palavra : palavras){

            if(contador.containsKey(palavra)){
                contador.put(palavra, contador.get(palavra) + 1);
            }else{
                contador.put(palavra, 1);
            }

        }

        System.out.println(contador);
    }
}
