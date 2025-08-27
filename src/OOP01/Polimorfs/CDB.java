package OOP01.Polimorfs;

public class CDB extends Investimento {
    public CDB(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return valorAplicado * 0.01;
    }
}


