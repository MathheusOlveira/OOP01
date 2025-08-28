package OOP01.Colecoes;

import java.util.List;

public class HistoricoTransa05 {
    public static void registrarTransacao(List<String> historico, String transacao){
        historico.add(transacao);
    }
    public boolean buscarTransacao(List<String> historico, String transacao){
        return historico.contains(transacao);
    }
    public static void exibirHistorico(List<String> historico){
        historico.forEach(System.out::println);
       /*
        for(String transacao : historico){
            System.out.println(transacao);
        }
        */
    }

    public static void main(String[] args) {
        List<String> historico = new java.util.ArrayList<>();
        registrarTransacao(historico, "Depósito de R$ 1000,00");
        registrarTransacao(historico, "Saque de R$ 200,00");
        registrarTransacao(historico, "Transferência de R$ 300,00 para conta 12345-6");

        System.out.println("Histórico de Transações:");
        exibirHistorico(historico);

        HistoricoTransa05 ht = new HistoricoTransa05();
        String busca = "Saque de R$ 200,00";
        System.out.println("Busca pela transação '" + busca + "': " + (ht.buscarTransacao(historico, busca) ? "Encontrada" : "Não encontrada"));
    }
}
