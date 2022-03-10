package br.com.br.exercicios.loops;

import java.util.Scanner;

public class soma_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        //insira as variáveis corretamente
        int soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
