package ContagemDeCaracter;

public class ContarCaractere {

    public static int contar(String texto, char alvo, int indice) {

        if (indice == texto.length()) {
            return 0;
        }

        int contador = 0;
        if (texto.charAt(indice) == alvo) {
            contador = 1;
        }

        return contador + contar(texto, alvo, indice + 1);
    }

    public static int contar(String texto, char alvo) {
        return contar(texto, alvo, 0);
    }

    public static void main(String[] args) {

        String palavra1 = "estrutura";
        char c1 = 't';

        String palavra2 = "programacao";
        char c2 = 'a';

        String palavra3 = "java";
        char c3 = 'z';

        System.out.println("Texto: " + palavra1 + " | Caractere: " + c1 +
                " | Quantidade: " + contar(palavra1, c1));

        System.out.println("Texto: " + palavra2 + " | Caractere: " + c2 +
                " | Quantidade: " + contar(palavra2, c2));

        System.out.println("Texto: " + palavra3 + " | Caractere: " + c3 +
                " | Quantidade: " + contar(palavra3, c3));
    }
}