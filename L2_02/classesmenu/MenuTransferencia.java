package L2_02.classesmenu;

import L2_02.classespagamento.PagamentoTransferencia;

import java.util.Scanner;

public class MenuTransferencia {
    public static void menuTransferencia(){
        Scanner input = new Scanner(System.in);
        PagamentoTransferencia pagamento = new PagamentoTransferencia();
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
                    System.out.println("Digite o nome que aparece na conta: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    System.out.println("digite o número da conta: ");
                    long numero = input.nextLong();
                    System.out.println("Digite o número da agência: ");
                    int agencia = input.nextInt();
                    System.out.println("Digite a senha da conta: ");
                    int senha = input.nextInt();
                    input.nextLine();
                    pagamento.setNomeConta(nome);
                    pagamento.setNumeroConta(numero);
                    pagamento.setNumeroAgencia(agencia);
                    pagamento.setSenhaConta(senha);
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
                    System.out.println("Digite uma ação: ");
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
                System.out.println("1. Inserir dados da conta");
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
