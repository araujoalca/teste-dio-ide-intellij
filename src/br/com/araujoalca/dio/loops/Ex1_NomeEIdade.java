package br.com.araujoalca.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        String aluno;
        int idade;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        aluno = scan.next();

        while (!aluno.equals("0")) {
            System.out.print("Agora digite a idade: ");
            idade = scan.nextInt();

            System.out.print("\nDigite o nome do aluno: ");
            aluno = scan.next();
        }

        scan.close();
    }
}
