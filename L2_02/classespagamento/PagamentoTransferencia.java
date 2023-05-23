package L2_02.classespagamento;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.time.LocalDate;

public class PagamentoTransferencia extends Pagamento{
    private String nomeConta;
    private long numeroConta;
    private long numeroAgencia;
    private int senhaConta;

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(int senhaConta) {
        this.senhaConta = senhaConta;
    }

    @Override
    public boolean gerarCompra() {
        dataCompra = LocalDate.now();
        System.out.println("Cartao: \nValor: R$" + this.valor);
        System.out.println("Data da compra: " + this.dataCompra);
        System.out.println("Nome na conta: " + this.nomeConta);
        System.out.println("Numero da conta: " +this.numeroConta);
        System.out.println("Numero da agência: " +this.numeroConta);
        System.out.println("Senha da conta: " + this.senhaConta);

        return statusCompra = true;
    }

    public void realizarPagamento() {
        if(this.nomeConta == null || this.numeroConta == 0 || this.numeroAgencia == 0 || this.senhaConta == 0){
            System.out.println("\nNão cadastrou uma conta válida");
        } else if (statusCompra = false) {
            System.out.println("Não existem compras a serem pagas");
        } else{
            System.out.println("Pagamento Realizado com sucesso");
            this.statusPagamento = true;
        }
    }
}
