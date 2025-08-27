package OOP01.ClasseAbstrata;

public class CartaoDebito extends Cartao {
    private double saldoConta;

    public CartaoDebito(String numero, double limite, double saldoConta) {
        super(numero, limite);
        this.saldoConta = saldoConta;
    }

    @Override

    public void processarCompra(double valor) {
        if (valor <= saldoConta) {
            saldoConta -= valor;
            System.out.println("Compra aprovada no débito. Saldo restante: " + saldoConta);
        } else {
            System.out.println("Compra recusada! Saldo insuficiente.");
        }
    }
}

