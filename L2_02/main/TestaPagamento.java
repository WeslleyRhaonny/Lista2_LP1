package L2_02.main;

import java.util.Scanner;

import static L2_02.classesmenu.MenuBoleto.menuBoleto;
import static L2_02.classesmenu.MenuCartao.menuCartao;
import static L2_02.classesmenu.MenuTransferencia.menuTransferencia;

public class TestaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("1. Pagamento por boleto");
        System.out.println("2. Pagamento por cartão de crédito");
        System.out.println("3. Pagamento por transferencia bancária");
        System.out.println("Digite o método de pagamento: ");
        menu = input.nextInt();
        switch (menu) {
            case 1: {
                menuBoleto();
                break;
            }
            case 2: {
                menuCartao();
                break;
            }
            case 3: {
                menuTransferencia();
                break;
            }
        }
    }
}


