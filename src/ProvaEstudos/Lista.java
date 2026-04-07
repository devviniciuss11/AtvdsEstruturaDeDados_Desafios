package ProvaEstudos;
import java.util.ArrayList;
import java.util.LinkedList;
public class Lista {
    public static void main (String[]args){
        ArrayList<Double>lista=new ArrayList<>();
        lista.add(1.2);
        lista.add(2.3);
        lista.add(3.4);
        for(int i = 0;i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("lista alterada:");
        lista.set(2, 2.9);
        lista.set(0, 3.2);
        for(int i = 0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("Removendo indices 1");
        lista.remove(1);
        for(int i = 0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("limpando lista");
        lista.clear();
        if(lista.isEmpty()){
            System.out.println("lista esta vazia");
        }
        else {
        for(int i = 0; i< lista.size();i++){
            System.out.println(lista.get(i));
            }
         }

        System.out.println("LinkedList:");
        LinkedList<Integer>lista2=new LinkedList<>();
        lista2.addFirst(1);
        lista2.addFirst(2);
        lista2.addFirst(3);
        lista2.addFirst(4);
        lista2.addFirst(5);
        for(int i = lista2.size()-1;i >= 0;i--){
            System.out.println(lista2.get(i));
        }
        System.out.println("lista alterada:");
        lista2.set(0, 12);
        lista2.set(3, 0);
        lista2.set(4, 20);
        for(int i = lista2.size()-1;i >=0;i--){
            System.out.println(lista2.get(i));
        }
        System.out.println("Removendo primeiro e ultimo elemento");
        lista2.removeFirst();
        lista2.removeLast();
        System.out.println(lista2);
        System.out.println("Removendo indice 2");
        lista2.remove(2);
        for(int i = 0;i < lista2.size();i++){
            System.out.println(lista2.get(i));
        }
        System.out.println("limpando lista");
        lista2.clear();
        if(lista2.isEmpty()){
            System.out.println("lista esta vazia");
        }
        else{
            for(int i = 0; i< lista2.size(); i++){
                System.out.println(lista2.get(i));
            }
        }
    }
}
