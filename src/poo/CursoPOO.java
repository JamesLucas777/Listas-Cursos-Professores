package poo;

import java.util.ArrayList;

public class CursoPOO {
    private String nome;
    private String descricao;
    private ArrayList<ProfessorPOO> professores;
    private int cargaHoraria;

    public CursoPOO(String nome, String descricao, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professores = new ArrayList<>(); // lista dos professores que dão o curso
    }

    public String getNome() {
        return nome;
    }

//    public String getDescricao() {
//        return descricao;
//    }

    public ArrayList<ProfessorPOO> getProfessores() {
        return professores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void adicionarProfessor(ProfessorPOO professor) {
        professores.add(professor);
    }

    public void progresso() {
        System.out.println("Verificando o progresso dos alunos no curso de " + nome);
        // TODO: Implementar a lógica para verificar o progresso dos alunos (caso precise futuramente)
        // Por enquanto o exercício não pede nada extra
    }

    public void notas() {
        System.out.println("Verificando as notas dos alunos no curso de " + nome);
        // TODO:Implementar a lógica para verificar as notas dos alunos (se precise futuramente)
        // Por enquanto o exercício não pede nada extra
    }

    public void participacao() {
        System.out.println("Verificando a participação dos alunos no curso de " + nome);
        // TODO: Implementar a lógica para verificar a participação dos alunos (caso precise futuramente)
        // Por enquanto o exercício não pede nada extra
    }
}

