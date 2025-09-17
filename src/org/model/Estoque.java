package org.model;

public class Estoque {
    private String produto;
    private int[] quantidades;

    // Construtor sem parâmetros
    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidades = new int[5]; // Inicializa com 5 posições de zeros
    }

    // Construtor com parâmetros
    public Estoque(String produto, int[] quantidades) {
        this.produto = produto;
        if (quantidades.length == 5) {
            this.quantidades = quantidades.clone();
        } else {
            throw new IllegalArgumentException("Devem ser fornecidas exatamente 5 quantidades.");
        }
    }

    // Método para imprimir informações do estoque
    public void imprimirEstoque() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidades por lote:");
        for (int i = 0; i < quantidades.length; i++) {
            System.out.println("Lote " + (i + 1) + ": " + quantidades[i] + " unidades");
        }
    }

    // Método para calcular o total em estoque
    public int calcularTotalEstoque() {
        int total = 0;
        for (int quantidade : quantidades) {
            total += quantidade;
        }
        return total;
    }

    // Método para verificar disponibilidade
    public boolean verificarDisponibilidade(int quantidadeMinima) {
        for (int quantidade : quantidades) {
            if (quantidade > quantidadeMinima) {
                return true;
            }
        }
        return false;
    }
}