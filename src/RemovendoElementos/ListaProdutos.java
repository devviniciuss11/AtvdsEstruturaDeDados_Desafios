package RemovendoElementos;
import java.util.ArrayList;

public class ListaProdutos {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");
        produtos.add("Açúcar");

        System.out.println("Lista original de produtos:");
        for (String produto : produtos) {
            System.out.println(produto);
        }

        String produtoRemover = "Leite";

        boolean removido = produtos.remove(produtoRemover);

        if (removido) {
            System.out.println("\nProduto \"" + produtoRemover + "\" removido com sucesso!");
        } else {
            System.out.println("\nProduto não encontrado.");
        }

        System.out.println("\nLista atualizada de produtos:");
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }
}
