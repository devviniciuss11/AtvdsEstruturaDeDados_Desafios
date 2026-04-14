package ProvaEstudos;

import ProvaEstudos.GENERICOSSS.Acessorio;
import ProvaEstudos.GENERICOSSS.Caixa;
import ProvaEstudos.GENERICOSSS.Epi;
import ProvaEstudos.GENERICOSSS.Ferramenta;

public class Genericos {
    public static <T> void imprimir(T valor){
        System.out.println(valor);
    }
    public static void main(String[]args){
        Caixa<Object> caixa = new Caixa<>();
        caixa.adicionarFerramenta(new Ferramenta('S'));
        caixa.adicionarFerramenta(new Epi(1));
        caixa.adicionarFerramenta(new Acessorio("Vinicius"));
        caixa.mostrarFerramentas();

    }
}
