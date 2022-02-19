package br.com.araujoalca.dio;

import br.com.araujoalca.dio.model.Gato;

public class PrimeiroVezIntelliJ {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        System.out.println("\nOlá, Mundo!!!\nA soma de a + b é " + a + " + " + b + " = " + (a + b));


        Gato gato = new Gato();
        Livro livro = new Livro("A Bíblia Sagrada", 1650);
        
        System.out.println("\n" + gato);
        System.out.println("\n" + livro);

    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}