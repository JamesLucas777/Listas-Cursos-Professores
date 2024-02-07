package poo;

public class ProfessorPOO {
    private String nome;
    private String especialidade;

    public ProfessorPOO(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void ensinar() {
        System.out.println("Professor " + getNome() + " ensinando na especialidade de " + getEspecialidade());
        // TODO: Implementar (se necessário futuramente) mais coisas
    }
}
