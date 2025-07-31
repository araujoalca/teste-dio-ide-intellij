package br.com.araujoalca.dio.arrays;

import java.util.Random;


/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class Ex4_ArrayMultidimensional {
    public static void main (String[] args) {
        Random random = new Random();
        int[][] numeros = new int[4][4];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(10);   // gera números entre 0 e 9.
            }
        }


        for ( int[] linha : numeros){
            for ( int elemento : linha)    {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
}
