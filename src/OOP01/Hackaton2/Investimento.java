package OOP01.Hackaton2;

public abstract class Investimento {
    public double valorInicial;

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public abstract void calcularRendimento();

}