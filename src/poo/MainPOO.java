package poo;

public class MainPOO {
    public static void main(String[] args) {

        ProfessorPOO profJava = new ProfessorPOO("Gabriel", "Programação em Java");
        ProfessorPOO profPython = new ProfessorPOO("André", "Programação em Python");

        CursoPOO cursoJava = new CursoPOO("Java", "Curso de programação em Java", 900);
        cursoJava.adicionarProfessor(profJava);

        CursoPOO cursoPython = new CursoPOO("Python", "Curso de programação em Python", 600);
        cursoPython.adicionarProfessor(profPython);

        // chamar os métodos (por enquanto só vão imprimir no console)
        cursoJava.progresso();
        cursoJava.notas();
        cursoJava.participacao();
        profJava.ensinar();
        System.out.println("O curso " + cursoJava.getNome() + " tem uma carga horária de " + cursoJava.getCargaHoraria() + " horas\n");

        // curso Python também chama os métodos
        cursoPython.progresso();
        cursoPython.notas();
        cursoPython.participacao();
        profPython.ensinar();
        System.out.println("O curso " + cursoPython.getNome() + " tem uma carga horária de " + cursoPython.getCargaHoraria() + " horas");
    }
}