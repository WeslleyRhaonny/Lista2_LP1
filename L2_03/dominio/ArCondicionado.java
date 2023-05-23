package L2_03.dominio;

public class ArCondicionado {
    protected int temperatura = 23;
    protected int modo = 1;

    public ArCondicionado(){

    }
    public ArCondicionado(int temperatura, int modo){
        this.temperatura = temperatura;
        this.modo = modo;
    }
}
