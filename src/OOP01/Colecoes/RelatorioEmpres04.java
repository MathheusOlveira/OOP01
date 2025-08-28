package OOP01.Colecoes;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class RelatorioEmpres04 {
    public static void adicionarParcela(Map<String, List<Double>> banco, String cpf, double valorParcela){
        banco.putIfAbsent(cpf, new ArrayList<>());
        banco.get(cpf).add(valorParcela);
    }

    public static double totalDevedor(Map<String, List<Double>> banco, String cpf){
        List<Double> parcelas = banco.get(cpf);
        double total  = 0.0;
        for(double parcela : parcelas){
            total += parcela;
        }
        return total;
    }

    public static void exibirRelatorioDevedor(Map<String, List<Double>> banco){
        banco.forEach((cpf, parcelas) -> {
            double total = 0.0;
            for(double parcela : parcelas){
                total += parcela;
            }
            System.out.println("CPF: " + cpf + " - Total Devedor: " + total);
        });
    }

    public static void main(String[] args) {
        Map<String, List<Double>> banco = new java.util.HashMap<>();
        adicionarParcela(banco, "123.456.789-00", 1500.0);
        adicionarParcela(banco, "123.456.789-00", 2000.0);
        adicionarParcela(banco, "987.654.321-00", 500.0);
        adicionarParcela(banco, "987.654.321-00", 700.0);
        adicionarParcela(banco, "987.654.321-00", 300.0);

        System.out.println("Total Devedor CPF 123.456.789-00: " + totalDevedor(banco, "123.456.789-00"));
        System.out.println("Total Devedor CPF 987.654.321-00: " + totalDevedor(banco, "987.654.321-00"));

        System.out.println("Relatório de Devedores:");
        exibirRelatorioDevedor(banco);
    }
}