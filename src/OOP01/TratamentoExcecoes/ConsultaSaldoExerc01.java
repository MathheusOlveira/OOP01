package OOP01.TratamentoExcecoes;

import java.util.*;
import java.util.Scanner;

public class ConsultaSaldoExerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] saldos = {1500.25, 2300.53, 500.06, 320.75, 890.10, 1200.80, 640.34, 910.86, 4700.09, 1320.75};

        while (true) {
            try {
                System.out.print("Digite o índice da conta (0 a " + (saldos.length - 1) + "): ");
                int indice = sc.nextInt();

                if (indice >= 0 && indice < saldos.length) {
                    System.out.println("Saldo da conta: R$ " + saldos[indice]);
                    break;
                } else {
                    System.out.println("Erro: Índice fora do intervalo. Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }
}