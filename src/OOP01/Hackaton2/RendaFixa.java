package OOP01.Hackaton2;

public class RendaFixa extends Investimento {
    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void calcularRendimento() {
        double rendimento = valorInicial * 0.05;
        double valorFinal = valorInicial + rendimento;
        System.out.println("|-------------------------------------|");
        System.out.println("Rendimento de Renda Fixa: " + rendimento);
        System.out.println("Valor Final de Renda Fixa: " + valorFinal);
        System.out.println("|-------------------------------------|");
    }
}