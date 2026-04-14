package ProvaEstudos.GENERICOSSS;

public class Ferramenta {
    char classe;

    public Ferramenta(char classe){
        this.classe=classe;
    }

    public char getClasse(){
        return classe;
    }
    public void setClasse(char classe){
        this.classe=classe;
    }
    @Override
    public String toString() {
        return "Classe: " + classe;
    }
}
