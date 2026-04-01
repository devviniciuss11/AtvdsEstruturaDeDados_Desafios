package PAginasPilha;

public class PilhaPaginas {

    private String[] pilha;
    private int topo;
    private int capacidade;

    public PilhaPaginas(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new String[capacidade];
        this.topo = -1;
    }

    public boolean estaVazio() {
        return topo == -1;
    }

    public void visitarPagina(String pagina) {
        if (topo == capacidade - 1) {
            System.out.println("Histórico cheio!");
            return;
        }
        topo++;
        pilha[topo] = pagina;
        System.out.println("Visitando: " + pagina);
    }

    public void voltar() {
        if (estaVazio()) {
            System.out.println("Não há páginas para voltar.");
            return;
        }

        System.out.println("Saindo da página: " + pilha[topo]);
        topo--;

        if (!estaVazio()) {
            System.out.println("Página atual: " + pilha[topo]);
        } else {
            System.out.println("Nenhuma página aberta.");
        }
    }

    public void paginaAtual() {
        if (estaVazio()) {
            System.out.println("Nenhuma página aberta.");
        } else {
            System.out.println("Página atual: " + pilha[topo]);
        }
    }

    public static void main(String[] args) {
        PilhaPaginas nav = new PilhaPaginas(10);

        nav.visitarPagina("google.com");
        nav.visitarPagina("youtube.com");
        nav.visitarPagina("github.com");

        nav.paginaAtual();

        nav.voltar();
        nav.voltar();

        nav.paginaAtual();

        nav.visitarPagina("stackoverflow.com");

        nav.paginaAtual();
    }
}
