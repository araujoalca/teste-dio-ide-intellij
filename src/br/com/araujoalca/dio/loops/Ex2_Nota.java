package br.com.araujoalca.dio.loops;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que peça uma nota (valor inteiro), entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
    public static void main(String[] args) {
        double nota;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);  //define '.' para separar decimais, e não a vírgula

        System.out.print("Digite uma nota entre 0.0 e 10.0: ");
        nota = input.nextDouble();

        while (nota < 0 || nota >10) {
            System.out.print("Por favor, informe um valor válido (entre 0.0 e 10.0): ");
            nota = input.nextDouble();
        }

        System.out.println("Finalizando com a nota " + nota);
        input.close();
    }
}
