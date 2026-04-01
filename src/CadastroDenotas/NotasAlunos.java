package CadastroDenotas;

import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        System.out.println("\nNotas armazenadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("\nMaior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média da turma: " + media);

        scanner.close();
    }
}
