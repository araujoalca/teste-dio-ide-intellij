package br.com.araujoalca.dio.calculadora;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Calculadora {
    public static void main(String[] args) {

        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = 3; //scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = 5; //can.nextInt();

        scan.close();

        int soma = somar(a, b);
        int subtracao =  subbrair(a, b);
        int multiplicacao = multiplicar(a, b);
        double divisao = dividir(a, b);

        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + subtracao);
        System.out.println(a + " * " + b + " = " + multiplicacao);
        System.out.println(a + " / " + b + " = " + divisao);

        int inteiroI = 10;
        long longL, longL2;

        longL2 = 10;
        longL = (long) longL2;
        System.out.println("Upcasting explícito não dá erro: longL = (long) " + longL);


        char caractere = 'B';
        long numero;

        numero = 'a';
        numero = caractere;
        //caractere = numero;
        caractere = 67;

        System.out.println("numero = " + numero);
        System.out.println("caractere = " + caractere);

        numero = 67;

        if (caractere == numero)
            System.out.println(caractere + " = " + numero);
        else
            System.out.println(caractere + " != " + numero);


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
