package OOP01.Hackaton1;
// Hackathon 1
// Matheus Oliveira de Assunção

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Matheus Oliveira", 8000.0, 2000.0);
        Analista analista = new Analista("Matheus Oliveira Junior", 5000.0, 1000.0);

        System.out.println("=== Gerente ===");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$ " + gerente.getSalario());
        System.out.println("Bônus Fixo: R$ " + gerente.getBonus());

        System.out.println("\n=== Analista ===");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Salário: R$ " + analista.getSalario());
        System.out.println("Bônus Fixo: R$ " + analista.getBonus());
    }
}