package ProvaEstudos.GENERICOSSS;

public class Epi {
    int tipo;

    public Epi(int tipo){
        this.tipo=tipo;
    }
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    @Override
    public String toString() {
        return "Tipo: " + tipo;
    }

}
