package br.com.araujoalca.dio.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um Programa que crie 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {
    public static void main (String[] args) {

        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            //numeros[i] = random.nextInt(100);  // gera números entre 0 e 99.
            numeros[i] = random.nextInt(50) + 51;  // gera números entre 51 e 100.
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("(" + (i+1) + ") " + numeros[i] + ", " + (numeros[i] + 1));
        }

    }
}
