package br.com.araujoalca.dio.arrays;

import java.util.Scanner;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        char[] caracteres = new char[6];
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean ehConsoante;
        int totalConsoantes = 0;
        char[] consoantes = new char[6];

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Digite o " + (i+1) + "o caractere: ");
            caracteres[i] = input.next(".").charAt(0);
        }

        for (int i = 0; i < caracteres.length; i++) {
            //Verifica se o caractere é uma letra do alfabeto.
            if (  (caracteres[i] >= 'a' && caracteres[i] <= 'z')  ||
                    (caracteres[i] >= 'A' && caracteres[i] <= 'Z') ){

                //VERIFICA SE É VOGAL (não consoante)
                ehConsoante = true;
                for (int k = 0; k < vogais.length; k++) {
                    if (caracteres[i] == vogais[k]) {
                        ehConsoante = false;
                        break;
                    }
                }

                if (ehConsoante) {
                    consoantes[totalConsoantes] = caracteres[i];
                    totalConsoantes++;
                }
            }

        }

        System.out.print(totalConsoantes + " consoante(s) encontrada(s) { ");
        for (int i = 0; i < totalConsoantes; i++) System.out.print(consoantes[i] + " ");
        System.out.print("}");

        input.close();
    }
}
