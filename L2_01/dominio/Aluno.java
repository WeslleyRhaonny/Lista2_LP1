package L2_01.dominio;

public class Aluno extends Pessoa {
    protected long matriculaAluno;

    public Aluno() {
    }

    public Aluno(String nome, String email, String telefone, long matriculaAluno) {
        super(nome, email, telefone);
        this.matriculaAluno = matriculaAluno;
    }

    public long getmatriculaAluno() {
        return matriculaAluno;
    }

    public String toString() {
        return super.toString() + ", Número de Matrícula: " + matriculaAluno;
    }
}
