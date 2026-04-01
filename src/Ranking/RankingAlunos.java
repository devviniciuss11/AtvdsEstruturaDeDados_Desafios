package Ranking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class RankingAlunos {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Bruno", 7.2));
        alunos.add(new Aluno("Carlos", 9.1));
        alunos.add(new Aluno("Daniela", 6.8));
        alunos.add(new Aluno("Eduardo", 8.9));

        System.out.println("Lista original:");
        for (Aluno a : alunos) {
            System.out.println(a.nome + " - " + a.nota);
        }

        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return Double.compare(a2.nota, a1.nota);
            }
        });

        System.out.println("\nRanking (maior para menor):");
        int posicao = 1;
        for (Aluno a : alunos) {
            System.out.println(posicao + "º - " + a.nome + " (" + a.nota + ")");
            posicao++;
        }
    }
}
