package Stream.ListaExerc01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exerc01 {
    public static void main(String[] args) {
        List<Integer> valoresA = Arrays.asList(5000, 200, 3000, 4200, 5000, 1500, 1000, 1111);
        int somaA = valoresA.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SomaA (>5000): " + somaA);

        List<Integer> valoresB = Arrays.asList(6000, 200, 3000, 4200, 500, 1500, 6000, 1111);
        int somaB = valoresB.stream()
                .filter(n -> n >= 5000)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SomaB (>5000): " + somaB);

        List<Integer> valoresC = Arrays.asList(500, 200, 3000, 4200, 7000, 1500, 7000, 1111);
        int somaC = valoresC.stream()
                .filter(n -> n >= 5000)
                .mapToInt(Integer::intValue)
                .reduce(0, Integer::sum);
        System.out.println("SomaC (>5000): " + somaC);

    }
}
