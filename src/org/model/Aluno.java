package org.model;

public class Aluno {
    private String nome;
    private double[] notas;

    // Construtor sem parâmetros
    public Aluno() {
        this.nome = "Desconhecido";
        this.notas = new double[4]; // Inicializa com zeros
    }

    // Construtor com parâmetros
    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        if (notas.length == 4) {
            this.notas = notas.clone();
        } else {
            throw new IllegalArgumentException("Devem ser fornecidas exatamente 4 notas.");
        }
    }

    // Método para imprimir informações
    public void imprimirInformacoes() {
        System.out.print("Nome: " + nome + "\nNotas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para verificar aprovação
    public boolean verificarNotaAprovacao(double valor) {
        for (double nota : notas) {
            if (nota < valor) {
                return false;
            }
        }
        return true;
    }
}
