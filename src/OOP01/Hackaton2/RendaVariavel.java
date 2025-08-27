package OOP01.Hackaton2;

public class RendaVariavel extends Investimento {
    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void calcularRendimento() {
        double rendimento = valorInicial * 0.10;
        double valorFinal = valorInicial + rendimento;
        System.out.println("Rendimento de Renda Variavel: " + rendimento);
        System.out.println("Valor Final de Renda Variavel: " + valorFinal);
    }
}