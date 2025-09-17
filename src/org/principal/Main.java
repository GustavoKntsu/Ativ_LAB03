package org.principal;

import org.model.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DAS 5 CLASSES ===\n");

        // 1. Classe Aluno
        System.out.println("1. CLASSE ALUNO");
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Maria Silva", new double[]{8.5, 7.0, 9.2, 6.8});

        aluno1.imprimirInformacoes();
        aluno2.imprimirInformacoes();
        System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Aluno 2 aprovado com nota mínima 7? " + aluno2.verificarNotaAprovacao(7.0));
        System.out.println();

        // 2. Classe Turma
        System.out.println("2. CLASSE TURMA");
        Turma turma1 = new Turma();
        Turma turma2 = new Turma("Matemática", new String[]{"João", "Maria", "Pedro", null, "Ana"});

        turma1.imprimirTurma();
        turma2.imprimirTurma();
        System.out.println("Quantidade de alunos na turma 2: " + turma2.quantidadeAlunos());
        System.out.println("Aluno 'Pedro' está na turma? " + turma2.buscarAluno("Pedro"));
        System.out.println();

        // 3. Classe Biblioteca
        System.out.println("3. CLASSE BIBLIOTECA");
        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca("Municipal",
                new String[]{"Dom Casmurro", "O Cortiço", null, "Memórias Póstumas", "Iracema"});

        biblioteca1.imprimirLivros();
        biblioteca2.imprimirLivros();
        System.out.println("Livros disponíveis na biblioteca 2: " + biblioteca2.contarLivrosDisponiveis());
        System.out.println("Livro 'Iracema' disponível? " + biblioteca2.verificarDisponibilidade("Iracema"));
        System.out.println();

        // 4. Classe Empresa
        System.out.println("4. CLASSE EMPRESA");
        Empresa empresa1 = new Empresa();
        Empresa empresa2 = new Empresa("Tech Solutions",
                new String[]{"João Silva", "Maria Santos", null, "Pedro Alves", "Ana Costa"});

        empresa1.imprimirFuncionarios();
        empresa2.imprimirFuncionarios();
        System.out.println("Funcionários na empresa 2: " + empresa2.contarFuncionarios());
        System.out.println("Funcionário 'Ana Costa' encontrado? " + empresa2.verificarFuncionario("Ana Costa"));
        System.out.println();

        // 5. Classe Estoque
        System.out.println("5. CLASSE ESTOQUE");
        Estoque estoque1 = new Estoque();
        Estoque estoque2 = new Estoque("Notebook", new int[]{15, 8, 20, 5, 12});

        estoque1.imprimirEstoque();
        estoque2.imprimirEstoque();
        System.out.println("Total em estoque do produto 2: " + estoque2.calcularTotalEstoque());
        System.out.println("Existe lote com mais de 10 unidades? " + estoque2.verificarDisponibilidade(10));
        System.out.println();

        System.out.println("=== FIM DA DEMONSTRAÇÃO ===");
    }
}