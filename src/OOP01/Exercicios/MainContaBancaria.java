package OOP01.Exercicios;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Matheus");
        cb.setNumeroConta("777777777777");
        cb.depositar(10000);
        cb.sacar(5000);
        cb.exibirExtrato();
    }
}
