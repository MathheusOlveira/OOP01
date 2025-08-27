package OOP01.ClasseAbstrata;

public class MainPagamento {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito("6969-6969-6969-6969", 1400.1);
        CartaoDebito cd = new CartaoDebito("1111-2222-3333-4444", 0, 700.0);

        cc.processarCompra(399.0);
        cd.processarCompra(199.0);
    }

}
