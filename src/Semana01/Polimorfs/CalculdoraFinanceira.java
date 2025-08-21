package Semana01.Polimorfs;

public class CalculdoraFinanceira {
    protected double capital;
    protected double taxaJurosMensal;
    protected int meses;

    public CalculdoraFinanceira(double capital, double taxaJurosMensal, int meses) {
        this.capital = capital;
        this.taxaJurosMensal = taxaJurosMensal;
        this.meses = meses;
    }

    public void calcularJuros(double capital, double taxaJurosMensal, int meses) {
        double montante = capital * Math.pow((1 + taxaJurosMensal), meses);
        System.out.printf("O montante após %d meses é: %.2f%n", meses, montante);
    }
    public void calcularJuros(double capital, double taxaJurosMensal) {
        int meses = 12;
        double montante = capital * Math.pow((1 + taxaJurosMensal), meses);
        System.out.printf("O montante após %d meses é: %.2f%n", meses, montante);
    }
    public void calcularJuros(double capital) {
        double taxaJurosMensal = 0.015; // Taxa fixa de 5%
        int meses = 12;
        double montante = capital * Math.pow((1 + taxaJurosMensal), meses);
        System.out.printf("O montante após %d meses é: %.2f%n", meses, montante);
    }


}
