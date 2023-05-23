package L2_03.dominio;

import L2_03.interfaces.IControle;

public class ControleSom implements IControle {
    Som som = new Som();
    @Override
    public void aumentarNumero() {
        if (som.volume == 100){
            System.out.println("O volume já está no volume máximo");
        }
        else{
            som.volume ++;
            System.out.println("Volume: " + som.volume);
        }
    }

    @Override
    public void diminuirNumero() {
        if (som.volume == 0){
            System.out.println("O som está no mudo atualmente");
        }
        else{
            som.volume --;
            System.out.println("Volume: " + som.volume);
        }
    }

    @Override
    public void aumentarModo() {
        if (som.modo == 6){
            som.modo = 1;
            System.out.println("Modo: " + som.modo);
        }
        else{
            som.modo ++;
            System.out.println("Modo: " + som.modo);
        }
    }

    @Override
    public void diminuirModo() {
        if (som.modo == 1){
            som.modo = 6;
            System.out.println("Modo: " + som.modo);
        }
        else{
            som.modo --;
            System.out.println("Modo: " + som.modo);
        }
    }
}
