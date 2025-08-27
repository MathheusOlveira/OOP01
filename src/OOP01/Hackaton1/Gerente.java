package OOP01.Hackaton1;

public class Gerente extends Funcionario{
    private double bonus = 2000.0;
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}