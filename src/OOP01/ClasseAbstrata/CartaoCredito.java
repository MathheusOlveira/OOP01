package OOP01.ClasseAbstrata;

public class CartaoCredito extends Cartao{
    public CartaoCredito(String numero, double limite) {
        super(numero, limite);
    }

    @Override

    public void processarCompra(double valor) {
        if (valor <= getLimite()){
            setLimite(getLimite() - valor);
            System.out.println("Compra aprovada no crédito. Limite restante: " + getLimite());
        } else {
            System.out.println("Compra recusada! Limite insuficiente.");
        }
    }
}
