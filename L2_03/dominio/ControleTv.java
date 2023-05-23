package L2_03.dominio;

import L2_03.interfaces.IControle;

import java.util.Scanner;

import static L2_03.classesauxiliares.Verificadores.isNumeric;

public class ControleTv implements IControle {
    Televisao televisao = new Televisao(0,1);

    @Override
    public void aumentarNumero() {
        if (televisao.volume == 100){
            System.out.println("O volume já está no volume máximo");
        }
        else{
            televisao.volume ++;
            System.out.println("Volume: " + televisao.volume);
        }
    }

    @Override
    public void diminuirNumero() {
        if (televisao.volume == 0){
            System.out.println("A TV já está no mudo");
        }
        else{
            televisao.volume --;
            System.out.println("Volume: " + televisao.volume);
        }
    }

    @Override
    public void aumentarModo() {
        if (televisao.canal == 300){
            televisao.canal = 1;
            System.out.println("Canal: " + televisao.canal);
        }
        else{
            televisao.canal ++;
            System.out.println("Canal: " + televisao.canal);
        }
    }

    @Override
    public void diminuirModo() {
        if (televisao.canal == 1){
            televisao.canal = 300;
            System.out.println("Canal: " + televisao.canal);
        }
        else{
            televisao.canal --;
            System.out.println("Canal: " + televisao.canal);
        }
    }
    public void mudarCanal(){
        Scanner input = new Scanner(System.in);
        String canal = "";
        boolean verificador = false;
        System.out.println("A TV tem 300 Canais. Escolha o canal: ");

        do {
            televisao.canal = input.nextInt();
            canal = Integer.toString(televisao.canal);
            verificador = isNumeric(canal);

            if ((televisao.canal > 300 || televisao.canal < 1) || verificador == false) {
                System.out.println("Canal Inválido, verifique se o canal que você está digitando tem apenas números e se é um canal entre o número 1 e 300");
                System.out.println("Digite um novo canal: ");
            }
        } while ((televisao.canal > 300 || televisao.canal < 1) || verificador == false);
        System.out.println("Canal: " + televisao.canal);
    }
    public void consultarVolume(){
        System.out.println("Volume: " + televisao.volume);
    }
    public void consultarCanal(){
        System.out.println("Canal: " + televisao.canal);
    }
}
