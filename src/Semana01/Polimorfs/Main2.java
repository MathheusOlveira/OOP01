package Semana01.Polimorfs;

public class Main2 {
    public static void main(String[] args) {
        Investimento[] investimentos = {
                new Poupanca(1000),
                new CDB(2000),
                new Poupanca(1500),
                new CDB(3000)
        };

        for (Investimento inv : investimentos) {
            double rendimento = inv.calcularRendimento();
            System.out.println("Rendimento: R$ " + rendimento);
        }
    }
}

