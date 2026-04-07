package ProvaEstudos;

public class Genericos {
    public static <T> void imprimir(T valor){
        System.out.println(valor);
    }
    public static void main(String[]args){
        imprimir(10);
        imprimir("Vinicius");
        imprimir(true);
        imprimir(10.5);
    }
}
