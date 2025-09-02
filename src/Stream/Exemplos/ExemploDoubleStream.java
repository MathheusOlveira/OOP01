package Stream.Exemplos;

import java.util.stream.DoubleStream;

public class ExemploDoubleStream {
    public static void main(String[] args) {
        DoubleStream.of(2.5, 3.7, 4.1).map(v -> v * 2)
                .forEach(System.out::println);
        System.out.println();

        double media = DoubleStream.of(10.5, 20.3, 9.5, 8.3, 30.1)
                .average()
                .orElse(0);

        System.out.println("Média: " + media);
    }
}