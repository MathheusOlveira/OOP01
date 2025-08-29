package OOP01.HackathonCollections;

//Classe Transacao para registrar transações de depósito, saque e transferência + LocalDateTime
//Não conseguimso formatar como o LocalDateTime apresenta a data e hora, mas está funcionando corretamente.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Transacao {
    private static Map<Integer, List<Transacao>> historicoPorConta = new HashMap<>();
    private String tipo; // "Depósito", "Saque", "Transferência"
    private double valor;
    private LocalDateTime data;
    private int contaOrigem, contaDestino; // Apenas para transferências

    public Transacao(String tipo, double valor, int contaOrigem, int contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }
    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | Valor: " + valor + " | Origem: " + contaOrigem + " | Destino: " + contaDestino;
    }
}
