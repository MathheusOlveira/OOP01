package Semana01.Polimorfs;

public class PagamentoCartaoCredito extends Pagamento{
    public String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }
    @Override
    public void processarPagamento() {
        System.out.printf("Processando pagamento com Cartão de Crédito: %s no valor de R$ %.2f%n ", numeroCartao, valor);
    }


}
