package L2_02.classesmenu;

import L2_02.classespagamento.PagamentoCartao;

import java.util.Scanner;

public class MenuCartao {
    public static void menuCartao(){
        Scanner input = new Scanner(System.in);
        PagamentoCartao pagamento = new PagamentoCartao();
        int pagar;
        double valor;
        boolean finalizarPrograma = false;
        System.out.println("Digite o valor do pagamento: ");
        valor = input.nextDouble();
        pagamento.setValor(valor);
        System.out.println("1. inserir dados do cartão");
        System.out.println("2. Gerar fatura");
        System.out.println("3. Pagar Fatura");
        System.out.println("4. Consultar status da fatura");
        System.out.println("5. Imprimir Recibo");
        System.out.println("6. Sair");
        System.out.println("Digite uma ação: ");
        pagar = input.nextInt();
        while (finalizarPrograma == false) {
            switch (pagar) {
                case 1:
                    System.out.println("Digite o nome que aparece no cartao: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    System.out.println("digite o número do cartão: ");
                    String numero = input.nextLine();
                    System.out.println("Digite a senha do cartão: ");
                    int senha = input.nextInt();
                    input.nextLine();
                    pagamento.setNomeCartao(nome);
                    pagamento.setNumeroCartao(numero);
                    pagamento.setSenhaCartao(senha);

                case 2:
                    pagamento.gerarCompra();
                    break;
                case 3:
                    pagamento.realizarPagamento();
                    break;
                case 4:
                    pagamento.verificarPagamento();
                    break;
                case 5:
                    pagamento.gerarRecibo();
                    break;
                case 6:
                    finalizarPrograma = true;
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Ação inválida");
                    break;
            }
            if(finalizarPrograma == false){
                System.out.println("1. inserir dados do cartão");
                System.out.println("2. Gerar fatura");
                System.out.println("3. Pagar Fatura");
                System.out.println("4. Consultar status da fatura");
                System.out.println("5. Imprimir Recibo");
                System.out.println("6. Sair");
                System.out.println("Digite uma ação: ");
                pagar = input.nextInt();
            }
        }
    }
}
