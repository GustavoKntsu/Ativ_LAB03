package org.model;

public class Empresa {
    private String nome;
    private String[] funcionarios;

    //***************************
    // CONSTRUTORES
    public Empresa() {
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios.clone();
    }


    // Método para imprimir informações da empresa
    public void imprimirFuncionarios() {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Funcionários:");
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println((i + 1) + ". " + funcionarios[i]);
            }
        }
    }

    // Método para contar funcionários cadastrados
    public int contarFuncionarios() {
        int count = 0;
        for (String funcionario : funcionarios) {
            if (funcionario != null) {
                count++;
            }
        }
        return count;
    }

    // Método para verificar se um funcionário está cadastrado
    public boolean verificarFuncionario(String nomeFuncionario) {
        for (String funcionario : funcionarios) {
            if (funcionario != null && funcionario.equals(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }
}
