package Semana01.Polimorfs;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.printf("Processando pagamento genérico" + valor);

    }
}
