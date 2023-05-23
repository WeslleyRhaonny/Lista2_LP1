package L2_01.dominio;

public class Professor extends Pessoa {
    private String disciplina;
    private long matriculaProfessor;

    public Professor(String nome, String email, String telefone, String disciplina, long matriculaProfessor) {
        super(nome, email, telefone);
        this.disciplina = disciplina;
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public long getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public String toString() {
        return super.toString() + ", Disciplina: " + disciplina + ", Matrícula: " + matriculaProfessor;
    }


}
