package org.model;

public class Aluno {
    private String nome;
    private double[] notas;

    //*************************************
    // CONSTRUTORES
    public Aluno() {
        this.nome = "Desconhecido";
        this.notas= new double[4];
    }

    public Aluno(String nome, double[] nota) {
        this.nome = nome;
        if (nota.length == 4) {
            this.notas = nota.clone();
        } else {
            throw new IllegalArgumentException("Devem ser fornecidos 4 notas.");
        }
    }

    // Metodo para imprimir as informações do aluno
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome + "\nNotas: ");
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        System.out.println();
    }

    // Metodo para calcular media
    public double calcularMedia() {
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Metodo para verificar se o aluno foi aprovado
    public boolean verificarAprovado( double valor) {
        for(double nota : notas) {
            if(nota < valor) {
                return false;
            }
        }
        return true;
    }
}
