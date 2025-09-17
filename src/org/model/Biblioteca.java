package org.model;

public class Biblioteca {
    private String nome;
    private String[] livros;

    // Construtor sem parâmetros
    public Biblioteca() {
        this.nome = "Biblioteca Desconhecida";
        this.livros = new String[10]; // Inicializa com 10 posições nulas
    }

    // Construtor com parâmetros
    public Biblioteca(String nome, String[] livros) {
        this.nome = nome;
        this.livros = livros.clone(); // Copia o array recebido
    }

    // Método para imprimir informações da biblioteca
    public void imprimirLivros() {
        System.out.println("Nome da Biblioteca: " + nome);
        System.out.println("Livros disponíveis:");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println((i + 1) + ". " + livros[i]);
            }
        }
    }

    // Método para contar livros disponíveis
    public int contarLivrosDisponiveis() {
        int count = 0;
        for (String livro : livros) {
            if (livro != null) {
                count++;
            }
        }
        return count;
    }

    // Método para verificar disponibilidade de um livro
    public boolean verificarDisponibilidade(String nomeLivro) {
        for (String livro : livros) {
            if (livro != null && livro.equals(nomeLivro)) {
                return true;
            }
        }
        return false;
    }
}
