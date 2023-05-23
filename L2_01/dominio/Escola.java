package L2_01.dominio;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Pessoa> pessoas;

    public Escola() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void imprimirContatos() {
        System.out.println("Lista de contatos:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public void imprimirResponsaveis() {
        System.out.println("Lista de responsáveis:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Responsavel) {
                System.out.println(pessoa);
            }
        }
    }

    public void imprimirAlunos() {
        System.out.println("Lista de alunos:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                System.out.println(pessoa);
            }
        }
    }

    public void imprimirProfessores() {
        System.out.println("Lista de professores:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                System.out.println(pessoa);
            }
        }
    }

    public void imprimirContatoPorIndice(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            System.out.println("Contato de índice " + indice + ":");
            System.out.println(pessoas.get(indice));
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void imprimirContatoPorNome(String nome) {
        System.out.println("Contato(s) de nome \"" + nome + "\":");
        boolean encontrado = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com esse nome.");
        }
    }

}
