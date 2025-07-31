package br.com.araujoalca.dio.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String txtFatorial = " (";

        int numero, fatorial = 1;

        System.out.print("Fatorial do número: ");
        numero = input.nextInt();

        for (int i=numero; i > 0; i--) {
            fatorial *= i;
            txtFatorial += i;
            if (i > 1) txtFatorial += " X ";
        }
        txtFatorial += ")";

        System.out.println(numero + "!= " + fatorial + txtFatorial);

        input.close();
    }
}
