package L2_02.classespagamento;

import L2_02.interfaces.IPagamento;

import java.time.LocalDate;

public class Pagamento implements IPagamento {
    protected double valor;
    protected LocalDate data;
    protected LocalDate dataCompra;
    protected boolean statusCompra = false;
    protected boolean statusPagamento = false;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public boolean isStatusCompra() {
        return statusCompra;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public boolean gerarCompra() {
        this.dataCompra = LocalDate.now();
        System.out.println("Compra: \nValor: R$" + this.valor);
        System.out.println("Data de compra: " + this.dataCompra);
        System.out.println("Data limite de pagamento: " +this.dataCompra.plusDays(3));
        return statusCompra = true;
    }

    @Override
    public void realizarPagamento() {
        if(statusCompra == false){
            System.out.println("\nNão Existem compras a serem pagas");
        }
        else{
            System.out.println("Pagamento Realizado com sucesso");
            this.statusPagamento = true;
        }
    }

    @Override
    public void verificarPagamento() {
        if(statusPagamento == true){
            System.out.println("\nCompra paga");
        }
        else{
            System.out.println("\nPagamento nao realizado");
        }
    }

    @Override
    public void gerarRecibo() {
        if (statusPagamento==true){
            this.data = LocalDate.now();
            System.out.println("\nRecibo: \nValor: R$" + this.valor);
            System.out.println("Data de Pagamento: " + this.data);
        }
        else{
            System.out.println("Realize o pagamento para gerar a compra");
        }
    }
}
