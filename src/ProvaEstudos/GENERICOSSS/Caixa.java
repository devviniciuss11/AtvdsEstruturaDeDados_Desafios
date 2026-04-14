package ProvaEstudos.GENERICOSSS;

import java.util.ArrayList;
import java.util.List;

public class Caixa <T> {
    //Inicializar nosso array

    private final List<T> Ferramentas = new ArrayList<>();
    //Criando metodos para Manipular as Ferramentas no array

    public void adicionarFerramenta(T ferramenta){
        Ferramentas.add(ferramenta);
    }
    public void removerFerramenta(T ferramenta){
        Ferramentas.remove(ferramenta);
    }
    public void pegarFerramenta(T ferramenta, int posicao){
        Ferramentas.get(posicao);
    }

    public void mostrarFerramentas(){
        for(T ferramenta : Ferramentas){
            System.out.println(ferramenta);
        }
    }


}


