package L2_02.classespagamento;
/*
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    private String nomeCartao;
    private String numeroCartao;
    private int senhaCartao;

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(int senhaCartao) {
        this.senhaCartao = senhaCartao;
    }

    @Override
    public boolean gerarCompra() {
        dataCompra = LocalDate.now();
        System.out.println("Cartao: \nValor: R$" + this.valor);
        System.out.println("Data da compra: " + this.dataCompra);
        System.out.println("Nome no cartão: " + this.nomeCartao);
        System.out.println("Numero do cartao: " +this.numeroCartao);
        System.out.println("Senha do cartao: " + this.senhaCartao);

        return statusCompra = true;
    }
    public void realizarPagamento() {
        if(this.nomeCartao == null || this.numeroCartao == null || this.senhaCartao == 0){
            System.out.println("\nNão cadastrou um cartao valido");
        } else if (statusCompra = false) {
            System.out.println("Não existem compras a serem pagas");
        } else{
            System.out.println("Pagamento Realizado com sucesso");
            this.statusPagamento = true;
        }
    }
}
