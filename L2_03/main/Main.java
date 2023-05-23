package L2_03.main;

import L2_03.dominio.ControleTv;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu;
        boolean statusTv = true;
        Scanner input = new Scanner(System.in);
        ControleTv controle = new ControleTv();

        System.out.println("1. Aumentar o volume");
        System.out.println("2. Diminuir o volume");
        System.out.println("3. Aumentar o canal");
        System.out.println("4. Diminuir o canal");
        System.out.println("5. Escolher o canal");
        System.out.println("6. Consultar o volume");
        System.out.println("7. Consultar o canal");
        System.out.println("8. Desligar a TV");
        System.out.println("Escolha a ação que deseja fazer: ");
        menu = input.nextInt();
        while(statusTv == true){
            switch (menu){
                case 1:
                    controle.aumentarNumero();
                    break;
                case 2:
                    controle.diminuirNumero();
                    break;
                case 3:
                    controle.aumentarModo();
                    break;
                case 4:
                    controle.diminuirModo();
                    break;
                case 5:
                    controle.mudarCanal();
                    break;
                case 6:
                    controle.consultarVolume();
                    break;
                case 7:
                    controle.consultarCanal();
                    break;
                case 8:
                    statusTv = false;
                    System.out.println("TV desligada");
                    break;
                default:
                    System.out.println("Acão Inválida");
                    break;
            }
            if (statusTv == true) {
                System.out.println("1. Aumentar o volume");
                System.out.println("2. Diminuir o volume");
                System.out.println("3. Aumentar o canal");
                System.out.println("4. Diminuir o canal");
                System.out.println("5. Escolher o canal");
                System.out.println("6. Consultar o volume");
                System.out.println("7. Consultar o canal");
                System.out.println("8. Desligar a TV");
                System.out.println("Escolha a ação que deseja fazer: ");
                menu = input.nextInt();
            }
        }
    }
}
