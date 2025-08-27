package OOP01.Exercicios;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Salário Bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Desconto INSS: ");
        double descontoINSS = sc.nextDouble();

        System.out.println("Desconto IR: ");
        double descontoIR = sc.nextDouble();

        Funcionario palhaco = new Funcionario(nome, salarioBruto, descontoINSS, descontoIR);

        palhaco.exibirFolhaPagamento();
    }
}
