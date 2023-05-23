package L2_01.teste;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import L2_01.dominio.Aluno;
import L2_01.dominio.Escola;
import L2_01.dominio.Pessoa;
import L2_01.dominio.Professor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Escola escola = new Escola();
            boolean verificadorMatricula = false;

            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Cadastrar pessoa");
                System.out.println("2 - Imprimir lista de contatos");
                System.out.println("3 - Imprimir lista de responsáveis");
                System.out.println("4 - Imprimir lista de alunos");
                System.out.println("5 - Imprimir lista de professores");
                System.out.println("6 - Imprimir contato por índice");
                System.out.println("7 - Imprimir contato por nome");
                System.out.println("8 - Sair");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome:");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o email:");
                        String email = scanner.nextLine();
                        System.out.println("Digite o telefone:");
                        String telefone = scanner.nextLine();

                        System.out.println("1 - Pessoa comum");
                        System.out.println("2 - Aluno");
                        System.out.println("3 - Professor");
                        int tipoPessoa = scanner.nextInt();
                        scanner.nextLine();

                        if (tipoPessoa == 1) {
                            Pessoa pessoa = new Pessoa(nome, email, telefone);
                            escola.cadastrarPessoa(pessoa);
                        } else if (tipoPessoa == 2) {
                            int numeroMatricula=0;
                            System.out.println("Digite o número de matrícula:");
                             do {
                                numeroMatricula = scanner.nextInt();
                                scanner.nextLine();
                                String matriculastr = String.valueOf(numeroMatricula);
                                if (matriculastr.length()!=5) {
                                    System.out.println("Digite uma mátricula válida com cinco dígitos!");
                                }
                                else {
                                    verificadorMatricula = true;
                                }
                            }
                             while (verificadorMatricula == false);
                            Aluno aluno = new Aluno(nome, email, telefone, numeroMatricula);
                            escola.cadastrarPessoa(aluno);
                            verificadorMatricula = false;
                        } else if (tipoPessoa == 3) {
                            System.out.println("Digite a disciplina:");
                            String disciplina = scanner.nextLine();
                            long matriculaProfessor=0;
                            System.out.println("Digite o número de matrícula:");
                            do {
                                matriculaProfessor = scanner.nextLong();
                                scanner.nextLine();
                                String matriculastr = String.valueOf(matriculaProfessor);
                                if (matriculastr.length() != 5) {
                                    System.out.println("Digite uma mátricula válida com cinco dígitos!");
                                } else {
                                    verificadorMatricula = true;
                                }
                            }
                                while (verificadorMatricula == false);

                            Professor professor = new Professor(nome, email, telefone, disciplina, matriculaProfessor);
                            escola.cadastrarPessoa(professor);
                            verificadorMatricula = false;
                        } else {
                            System.out.println("Tipo de pessoa inválido!");
                        }

                        break;
                    case 2:
                        escola.imprimirContatos();
                        break;
                    case 3:
                        escola.imprimirResponsaveis();
                        break;
                    case 4:
                        escola.imprimirAlunos();
                        break;
                    case 5:
                        escola.imprimirProfessores();
                        break;
                    case 6:
                        System.out.println("Digite o índice:");
                        int indice = scanner.nextInt();
                        scanner.nextLine();
                        escola.imprimirContatoPorIndice(indice);
                        break;
                    case 7:
                        System.out.println("Digite o nome:");
                        String nomeBusca = scanner.nextLine();
                        escola.imprimirContatoPorNome(nomeBusca);
                        break;
                    case 8:
                        System.out.println("Programa finalizado.");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }

    }



