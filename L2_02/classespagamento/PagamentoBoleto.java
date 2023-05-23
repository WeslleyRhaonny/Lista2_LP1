package L2_02.classespagamento;

import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento {

    @Override
    public boolean gerarCompra() {
        dataCompra = LocalDate.now();
        System.out.println("Boleto: \nValor: R$" + this.valor);
        System.out.println("Data de expedição do boleto: " + this.dataCompra);
        System.out.println("Data de expiração do boleto: " +this.dataCompra.plusDays(3));
        return statusCompra = true;
    }

}
