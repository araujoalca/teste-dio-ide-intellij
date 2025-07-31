package br.com.araujoalca.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números inteiros
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args){
        int[] numeros = new int[5];
        int maior = -2147483648;  // menor número inteiro possível
        float media = 0.0f;

        Scanner input = new Scanner(System.in);

        for (int  i=0; i<5; i++) {
            System.out.print("Digite o " + (i+1) + "o. número: ");
            numeros[i] = input.nextInt();
            if (numeros[i] > maior ) {
                maior = numeros[i];
            }
            media += numeros[i];
        }

        media /= 5;

        System.out.println("O  maior número é " + maior + " e a média é " + media);

        input.close();
    }
}
