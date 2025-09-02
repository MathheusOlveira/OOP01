package Stream.ListaExerc01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exerc03 {
    public static void main(String[] args) {
        List<Integer> saldo = Stream.of(5000, 200, 3000, -4200, 5123, 1500, 1000, 1111)
                .filter(v -> v < 0)
                .toList();

        System.out.println("Saldo negativo: " + saldo);
    }
}
