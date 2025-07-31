package br.com.araujoalca.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int totalPares = 0, totalImpares = 0;

        System.out.print("Digite a quantidade de números: ");
        int totalNumeros = input.nextInt();

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Entre com o " + (i + 1) + "o. número: ");
            numero = input.nextInt();

            if (numero % 2 == 0) totalPares ++;
            else totalImpares ++;
        }

        System.out.println("Dos " + totalNumeros + " números digitados, " + totalPares
                + " são pares e " + totalImpares + " são ímpares.");

        input.close();
    }
}
