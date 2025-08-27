package OOP01.Polimorfs;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new Pagamento(100),
                new PagamentoCartaoCredito(250, "6969-6969-6969-3456"),
                new PagamentoPix(300, "cliente@email.com")
        };

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
}

