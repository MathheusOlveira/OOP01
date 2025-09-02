package Stream.ListaExerc01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exerc02 {
    public static void main(String[] args) {
        List<Integer> deposito = Arrays.asList(5000, 200, 3000, 4200, 5123, 1500, 1000, 1111);

                int maiorDeposito = deposito.stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("Maior depósito: " + maiorDeposito);
    }
}