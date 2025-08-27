package OOP01.Hackaton1;

public class Analista extends Funcionario{
        private double bonus = 1000.0;
        public Analista(String nome, double salario, double bonus) {
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