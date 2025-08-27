package OOP01.ClasseAbstrata;

public class MainConta {
    public static void main(String[] args) {

        Conta cliente1 = new ContaCorrent(100, 1400.0);
        Conta cliente2 = new ContaPoupanc(200, 3600.0);

        cliente1.atualizarMensal();
        cliente2.atualizarMensal();

        System.out.println("Saldo CC: " + cliente1.getSaldo());
        System.out.println("Saldo CP: " + cliente2.getSaldo());

    }
}
