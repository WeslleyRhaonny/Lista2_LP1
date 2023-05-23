package L2_01.dominio;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
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
