package Fatorial_de_um_numero;

import java.util.Scanner;

public class Fatorial {
    public long fatorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fatorial(n-1);
    }
    public static void main(String[]args){
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Digite um numero inteiro e positivo para calcular o fatorial: ");
            int n = sc.nextInt();
            Fatorial fatorial = new Fatorial();
            System.out.println("Fatorial de " +n);
            System.out.println("Resultado: "+fatorial.fatorial(n));

        }

    }

}
