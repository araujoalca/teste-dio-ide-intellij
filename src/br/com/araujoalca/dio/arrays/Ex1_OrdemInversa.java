package br.com.araujoalca.dio.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, -15, -10, -5};

        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) System.out.print(", ");
        }

        String texto = "açsdlkfjjj";
        texto.equalsIgnoreCase("a");
    }
}
