package exercicios1a4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void listarCursos(List<Curso> listaCursos) {
        if (listaCursos.isEmpty()) {
            System.out.println("\nNenhum curso encontrado.");
        } else {
            System.out.println("\nLista de Cursos:");
            for (int i = 0; i < listaCursos.size(); i++) {
                System.out.println(i + " - " + listaCursos.get(i).getNomeCurso());
            }
        }
    }

    private static void listarProfessores(List<Professor> listaProfessores) {
        if (listaProfessores.isEmpty()) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            System.out.println("\nLista de Professores: ");
            for (int i = 0; i < listaProfessores.size(); i++) {
                System.out.println(i + " - " + listaProfessores.get(i).getNome());
            }
        }
    }

    private static void listarNovosCursos(List<Curso> listaCursos, int indice) {
        System.out.println("\nLista dos novos cursos: ");

        for (int i = listaCursos.size() - indice; i < listaCursos.size(); i++) {
            System.out.println(listaCursos.get(i).getNomeCurso());
        }
    }

    private static void listarNovosProfessores(List<Professor> listaProfessores, int indice) {
        System.out.println("\nLista dos novos professores: ");

        for (int i = listaProfessores.size() - indice; i < listaProfessores.size(); i++) {
            System.out.println(listaProfessores.get(i).getNome());
        }
    }

    private static void cadastrarCurso(Scanner entrada, List<Curso> listaCursos) {
        System.out.print("Digite o nome do curso: ");
        String nome = entrada.nextLine();

        listaCursos.add(new Curso(nome));
        System.out.println("Curso cadastrado com sucesso!");
    }

    private static void cadastrarProfessor(Scanner entrada, List<Professor> listaProfessores) {
        System.out.print("Digite o nome do professor: ");
        String nome = entrada.nextLine();

        listaProfessores.add(new Professor(nome));
        System.out.println("Professor cadastrado com sucesso!");
    }

    private static int quantidadeVezesOperacao(Scanner entrada) {
        System.out.print("Digite quantas vezes deseja executar a operação: ");
        return getNumero(entrada);
    }

    private static int pedirIndiceCurso(Scanner entrada, List<Curso> listaCursos) {
        listarCursos(listaCursos);

        System.out.print("Digite o índice do curso escolhido: ");
        int indice = getNumero(entrada);

        if (indice > listaCursos.size() - 1 || indice < 0) { // verifica se o índice ultrapassa o tamanho da lista ou for negativo
            System.out.println("\nÍndice inválido. Tente novamente!");
            indice = pedirIndiceCurso(entrada, listaCursos);
        }
        return indice;
    }

    private static int pedirIndiceProfessor(Scanner entrada, List<Professor> listaProfessores) {
        listarProfessores(listaProfessores);

        System.out.print("Digite o índice do professor escolhido: ");
        int indice = getNumero(entrada);

        if (indice > listaProfessores.size() - 1 || indice < 0) { // verifica se o índice ultrapassa o tamanho da lista ou for negativo
            System.out.println("\nÍndice inválido. Tente novamente!");
            indice = pedirIndiceProfessor(entrada, listaProfessores);
        }
        return indice;
    }

    private static int getNumero(Scanner entrada) {
        int indice = entrada.nextInt();
        entrada.nextLine(); // consumir o \n
        return indice;
    }

    private static void removerCurso(List<Curso> listaCursos, int indice) {
        listaCursos.remove(indice);
    }

    private static void removerProfessor(List<Professor> listaProf, int indice) {
        listaProf.remove(indice);
    }

    private static void removerItemListaCursos(Scanner entrada, List<Curso> listaCursos) {
        if (!listaCursos.isEmpty()) {
            int indice = pedirIndiceCurso(entrada, listaCursos);
            String nomeCurso = listaCursos.get(indice).getNomeCurso();
            removerCurso(listaCursos, indice);
            System.out.println("\nCurso " + nomeCurso + " removido da lista de cursos.");
        } else {
            System.out.println("\nNenhum curso encontrado para ser removido.");
        }
    }

    private static void removerItemListaProfessores(Scanner entrada, List<Professor> listaProfessores) {
        if (!listaProfessores.isEmpty()) {
            int indice = pedirIndiceProfessor(entrada, listaProfessores);
            String nome = listaProfessores.get(indice).getNome();
            removerProfessor(listaProfessores, indice);
            System.out.println("\nProfessor " + nome + " removido com sucesso!");
        } else {
            System.out.println("\nNenhum professor encontrado para ser removido.");
        }
    }

    private static void marcarComoConcluido(Scanner entrada, List<Curso> listaCursos, List<Curso> cursosConcluidos) {
        if (!listaCursos.isEmpty()) {
            int indice = pedirIndiceCurso(entrada, listaCursos); // pede o índice do curso a ser concluído
            cursosConcluidos.add(listaCursos.get(indice)); // adiciona o curso a lista de concluídos

            System.out.print("\nDigite o índice novamente para confirmar a operação:");
            removerItemListaCursos(entrada, listaCursos); // remove o curso da lista de cursos
            System.out.println("\nCurso " + cursosConcluidos.get(cursosConcluidos.size() - 1).getNomeCurso() + " concluído!");
        } else {
            System.out.println("\nNenhum curso encontrado para marcar como concluído.");
        }
    }

    private static void listarCursosConcluidos(List<Curso> listaCursosConcluidos) {
        if (listaCursosConcluidos.isEmpty()) {
            System.out.println("\nNenhum curso concluído.");
        } else {
            System.out.println("\nLista de Cursos Concluídos: ");
            for (int i = 0; i < listaCursosConcluidos.size(); i++) {
                System.out.println(i + " - " + listaCursosConcluidos.get(i).getNomeCurso());
            }
        }
    }
    private static int getOpcaoMenu(Scanner entrada) {
        System.out.println("\n+------------------------------+");
        System.out.println("|             MENU             |");
        System.out.println("+------------------------------+");
        System.out.println("| (1) - Listar Cursos          |");
        System.out.println("| (2) - Listar Professores     |");
        System.out.println("| (3) - Cadastrar Cursos       |");
        System.out.println("| (4) - Cadastrar Professores  |");
        System.out.println("| (5) - Remover Curso          |");
        System.out.println("| (6) - Remover Professor      |");
        System.out.println("| (7) - Marcar como Concluído  |");
        System.out.println("| (8) - Listar Concluídos      |");
        System.out.println("+------------------------------+");
        System.out.println("| (0) - Sair                   |");
        System.out.println("+------------------------------+");
        System.out.print("Digite o número da opção desejada: ");

        return getNumero(entrada);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Curso> listaCursos = new ArrayList<>();
        List<Curso> listaCursosConcluidos = new ArrayList<>();
        List<Professor> listaProfessores = new ArrayList<>();

        while (true) {
            int opcao = getOpcaoMenu(scan);

            switch (opcao) {
                case 1: // Listar Cursos
                    listarCursos(listaCursos);
                    break;
                case 2: // Listar Professores
                    listarProfessores(listaProfessores);
                    break;
                case 3: // Cadastrar Cursos
                    int quantosCursos = quantidadeVezesOperacao(scan);
                    for (int i = 0; i < quantosCursos; i++) {
                        cadastrarCurso(scan, listaCursos);
                    }
                    listarNovosCursos(listaCursos, quantosCursos);
                    break;
                case 4: // Cadastrar Professores
                    int quantosProfessores = quantidadeVezesOperacao(scan);
                    for (int i = 0; i < quantosProfessores; i++) {
                        cadastrarProfessor(scan, listaProfessores);
                    }
                    listarNovosProfessores(listaProfessores, quantosProfessores);
                    break;
                case 5: // Remover Cursos
                    removerItemListaCursos(scan, listaCursos);
                    break;
                case 6: // Remover Professores
                    removerItemListaProfessores(scan, listaProfessores);
                    break;
                case 7: // Marcar como Concluído
                    marcarComoConcluido(scan, listaCursos, listaCursosConcluidos);
                    break;
                case 8: // Listar Cursos Concluídos
                    listarCursosConcluidos(listaCursosConcluidos);
                    break;
                case 0: // Sair
                    listarCursos(listaCursos);
                    listarProfessores(listaProfessores);
                    listarCursosConcluidos(listaCursosConcluidos);
                    System.out.println("\nPrograma encerrado.\n");
                    scan.close();
                    return;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}
