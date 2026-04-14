package ProvaEstudos;
import ProvaEstudos.GENERICOSSS.Caixa;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaGenerica {
    //uma lista generica onde podemos colocar qualquer tipo de dado e no final eu peercorro essa lista com um for para imprimir
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        lista.add("Texto");
        lista.add(10);
        lista.add(5.5);
        lista.add(true);
        lista.add('q');
        lista.add(false);
        for (Object item : lista) {
            System.out.println(item);
        }
    }
}

