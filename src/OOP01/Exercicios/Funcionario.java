package OOP01.Exercicios;

public class Funcionario {
    public String nome;
    public Double salarioBruto;
    public Double descontoINSS;
    public Double descontoIR;

    public Funcionario(String nome, double salarioBruto, double descontoINSS, double descontoIR){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.descontoINSS = descontoINSS;
        this.descontoIR = descontoIR;
    }
    public double calcularSalarioLiquido() {
        return salarioBruto - descontoIR - descontoINSS;
    }
    public void exibirFolhaPagamento() {
        System.out.println("---Folha de Pagamento---");
        System.out.println("Nome: " + nome);
        System.out.println("Seu Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto IR: " + descontoIR);
        System.out.println("Seu salário liquido: R$" + calcularSalarioLiquido());
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }
}