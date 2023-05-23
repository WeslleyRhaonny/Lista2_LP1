package L2_03.dominio;

import L2_03.interfaces.IControle;

public class ControleAr implements IControle {
    ArCondicionado ar = new ArCondicionado();
    @Override
    public void aumentarNumero() {
        if (ar.temperatura == 26){
            System.out.println("A temperatura está no máximo");
        }
        else{
            ar.temperatura ++;
            System.out.println("Temperatura: " + ar.temperatura);
        }
    }

    @Override
    public void diminuirNumero() {
        if (ar.temperatura == 16){
            System.out.println("A temperatura está no minimo");
        }
        else{
            ar.temperatura --;
            System.out.println("Temperatura: " + ar.temperatura);
        }
    }

    @Override
    public void aumentarModo() {
        if (ar.modo == 5){
            ar.modo = 1;
            System.out.println("Modo: " + ar.modo);
        }
        else{
            ar.modo ++;
            System.out.println("Modo: " + ar.modo);
        }
    }

    @Override
    public void diminuirModo() {
        if (ar.modo == 1){
            ar.modo = 5;
            System.out.println("Modo: " + ar.modo);
        }
        else{
            ar.modo --;
            System.out.println("Modo: " + ar.modo);
        }
    }
}
