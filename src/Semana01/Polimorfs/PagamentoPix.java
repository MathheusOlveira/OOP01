package Semana01.Polimorfs;

public class PagamentoPix extends Pagamento{
    public String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override

    public void processarPagamento() {
        System.out.printf("/n Processando pagamento com Pix: %s no valor de R$ %.2f%n /n", chavePix, valor);
    }
}
