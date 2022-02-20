package br.com.araujoalca.dio.calculadora;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Calculadora {
    public static void main(String[] args) {

        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        scan.close();

        int soma = somar(a, b);
        int subtracao =  subbrair(a, b);
        int multiplicacao = multiplicar(a, b);
        double divisao = dividir(a, b);

        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + subtracao);
        System.out.println(a + " * " + b + " = " + multiplicacao);
        System.out.println(a + " / " + b + " = " + divisao);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static int subbrair(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / (double) b;
    }
}
