package org.model;

public class Turma {
    private String nomeTurma;
    private String[] alunos;

    public Turma() {
        this.nomeTurma = "Sem Nome";
        this.alunos = new String[5];
    }

    public Turma(String nomeTurma, String[] alunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = alunos.clone();
    }


    // Metodo para imprimir informações da turma
    public void imprimirTurma() {
        System.out.println("Nome da Turma: " + nomeTurma);
        System.out.println("Alunos:");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println((i + 1) + ". " + alunos[i]);
            }
        }
    }

    // Metodo para contar alunos cadastrados
    public int quantidadeAlunos() {
        int count = 0;
        for (String aluno : alunos) {
            if (aluno != null) {
                count++;
            }
        }
        return count;
    }

    // Metodo para buscar aluno por nome
    public boolean buscarAluno(String nome) {
        for (String aluno : alunos) {
            if (aluno != null && aluno.equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
