package Semana01.Polimorfs;

public class Poupanca extends Investimento {
    public Poupanca(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return valorAplicado * 0.005;
    }
}

