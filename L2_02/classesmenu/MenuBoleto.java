package L2_02.classesmenu;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import L2_02.classespagamento.PagamentoBoleto;

import java.util.Scanner;

public class MenuBoleto {
    public static void menuBoleto(){
        Scanner input = new Scanner(System.in);
        PagamentoBoleto pagamento = new PagamentoBoleto();
        int pagar;
        double valor;
        boolean finalizarPrograma = false;
        System.out.println("Digite o valor do pagamento: ");
        valor = input.nextDouble();
        pagamento.setValor(valor);
        System.out.println("1. Gerar fatura");
        System.out.println("2. Pagar Fatura");
        System.out.println("3. Consultar status da fatura");
        System.out.println("4. Imprimir Recibo");
        System.out.println("5. Sair");
        System.out.println("Digite uma ação: ");
        pagar = input.nextInt();
        while (finalizarPrograma == false) {
            switch (pagar) {
                case 1:
                    pagamento.gerarCompra();
                    break;
                case 2:
                    pagamento.realizarPagamento();
                    break;
                case 3:
                    pagamento.verificarPagamento();
                    break;
                case 4:
                    pagamento.gerarRecibo();
                    break;
                case 5:
                    finalizarPrograma = true;
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Ação inválida");
                    break;
            }
            if(finalizarPrograma == false) {
                System.out.println("1. Gerar fatura");
                System.out.println("2. Pagar Fatura");
                System.out.println("3. Consultar status da fatura");
                System.out.println("4. Imprimir Recibo");
                System.out.println("5. Sair");
                System.out.println("digite uma nova ação: ");
                pagar = input.nextInt();
            }
        }
    }
}
